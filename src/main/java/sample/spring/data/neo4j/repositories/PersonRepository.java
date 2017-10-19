package sample.spring.data.neo4j.repositories;

import sample.spring.data.neo4j.domain.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

    Person findByName(String name);
}
