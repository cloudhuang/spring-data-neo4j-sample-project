package sample.spring.data.neo4j.repositories;

import sample.spring.data.neo4j.domain.Company;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface CompanyRepository extends GraphRepository<Company> {
    Company findByName(String name);
}
