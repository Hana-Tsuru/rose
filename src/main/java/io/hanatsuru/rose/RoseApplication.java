package io.hanatsuru.rose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class RoseApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoseApplication.class, args);
    }

}
