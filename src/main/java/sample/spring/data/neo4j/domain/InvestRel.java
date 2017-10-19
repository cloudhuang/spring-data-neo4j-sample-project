package sample.spring.data.neo4j.domain;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import java.util.Date;

@RelationshipEntity(type = "INVEST")
public class InvestRel {
    @GraphId
    private Long id;
    private Date since;

    @StartNode
    private Investor investor;
    @EndNode
    private Investee investee;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getSince() {
        return since;
    }

    public void setSince(Date since) {
        this.since = since;
    }

    public Investor getInvestor() {
        return investor;
    }

    public void setInvestor(Investor investor) {
        this.investor = investor;
    }

    public Investee getInvestee() {
        return investee;
    }

    public void setInvestee(Investee investee) {
        this.investee = investee;
    }
}
