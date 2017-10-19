package sample.spring.data.neo4j.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

@NodeEntity
public class Company implements Investor, Investee, Legal {
    @GraphId
    private Long id;

    private String name;
    private String neogen_id;

    @Relationship(type = "INVEST", direction = Relationship.OUTGOING)
    private Set<InvestRel> investees = new HashSet<>();

    @Relationship(type = "INVEST", direction = Relationship.INCOMING)
    private Set<InvestRel> investors = new HashSet<>();

    @Relationship(type = "EMPLOY", direction = Relationship.OUTGOING)
    private Set<EmployRel> employees = new HashSet<>();

    @Relationship(type = "LEGAL", direction = Relationship.OUTGOING)
    private Set<LegalRel> legalCompanies = new HashSet<>();

    @Relationship(type = "LEGAL", direction = Relationship.INCOMING)
    private LegalRel isLegalBy = new LegalRel();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNeogen_id() {
        return neogen_id;
    }

    public void setNeogen_id(String neogen_id) {
        this.neogen_id = neogen_id;
    }

    public Set<InvestRel> getInvestees() {
        return investees;
    }

    public void setInvestees(Set<InvestRel> investees) {
        this.investees = investees;
    }

    public Set<InvestRel> getInvestors() {
        return investors;
    }

    public void setInvestors(Set<InvestRel> investors) {
        this.investors = investors;
    }

    public Set<EmployRel> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<EmployRel> employees) {
        this.employees = employees;
    }

    public Set<LegalRel> getLegalCompanies() {
        return legalCompanies;
    }

    public void setLegalCompanies(Set<LegalRel> legalCompanies) {
        this.legalCompanies = legalCompanies;
    }

    public LegalRel getIsLegalBy() {
        return isLegalBy;
    }

    public void setIsLegalBy(LegalRel isLegalBy) {
        this.isLegalBy = isLegalBy;
    }
}
