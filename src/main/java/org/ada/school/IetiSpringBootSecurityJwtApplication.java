package org.ada.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"org.ada.school.repository.document"})
//@EntityScan("com.delivery.domain")
public class IetiSpringBootSecurityJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(IetiSpringBootSecurityJwtApplication.class, args);
	}

}
