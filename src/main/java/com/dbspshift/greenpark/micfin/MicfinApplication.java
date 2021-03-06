package com.dbspshift.greenpark.micfin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableMongoRepositories
//Swagger UI will be available at http://localhost:<portnumber>/swagger-ui.html
public class MicfinApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicfinApplication.class, args);
    }
}
