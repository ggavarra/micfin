package com.dbs.paradigmshift.greenpark.micfin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
//Swagger UI will be available at http://localhost:<portnumber>/swagger-ui.html
public class MicfinApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicfinApplication.class, args);


	}

}
