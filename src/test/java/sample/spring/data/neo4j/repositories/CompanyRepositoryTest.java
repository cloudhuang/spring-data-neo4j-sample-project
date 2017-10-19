package sample.spring.data.neo4j.repositories;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.neo4j.ogm.session.Session;
import org.parboiled.common.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import sample.spring.data.neo4j.domain.Company;
import sample.spring.data.neo4j.domain.InvestRel;

import java.util.Arrays;
import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class CompanyRepositoryTest {
    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private InvestRelRepository investRelRepository;
    @Autowired
    private Session session;

    @Before
    public void setUp() {
        String companiesTxt = FileUtils.readAllText(this.getClass().getClassLoader().getResourceAsStream("companies.txt"));

        Arrays.stream(companiesTxt.split(";")).forEach(comp -> {
            session.query(comp + ";", new HashMap<>());
        });
    }

    @Test
    public void getFindAllCompanies() throws Exception {
        Iterable<Company> all = companyRepository.findAll();
        all.forEach(comp -> {
            System.out.println(comp.getName());
        });
    }

    @Test
    public void testFindOneCompany() throws Exception {
        Company company = companyRepository.findByName("Myrtie Gutkowski");
        System.out.println(company.getInvestees().size());
    }

    @Test
    public void testFindInvestRelationship() throws Exception {
        Iterable<InvestRel> all = investRelRepository.findAll();

        all.forEach(investRel -> {
            System.out.println(investRel.getInvestor().getName() + " -> " + investRel.getInvestee().getName());
        });
    }

    @After
    public void tearDown() {
    }
}
