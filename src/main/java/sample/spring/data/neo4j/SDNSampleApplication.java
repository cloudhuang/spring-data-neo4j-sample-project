package sample.spring.data.neo4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("sample.spring.data.neo4j.domain")
public class SDNSampleApplication {
    private final static Logger log = LoggerFactory.getLogger(SDNSampleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SDNSampleApplication.class, args);
	}

}
