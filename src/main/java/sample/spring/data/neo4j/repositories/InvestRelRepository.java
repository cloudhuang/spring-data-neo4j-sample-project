package sample.spring.data.neo4j.repositories;

import sample.spring.data.neo4j.domain.InvestRel;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface InvestRelRepository extends GraphRepository<InvestRel> {
}
