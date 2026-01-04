package com.hcl.spring_boot_crud_with_mysql_database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(
	    info = @Info(
	        title = "Spring-Boot-MySQL-Crud-Operation",  // The application name
	        version = "1.0.0",  // Application version
	        description = "This is a Spring Boot application for managing Person and Adhar details.",  // Application description
	        termsOfService = "http://my-terms-of-service-url.com",  // Optional: Terms of service URL
	        contact = @Contact(
	            name = "Support Team",
	            email = "support@example.com",
	            url = "http://support.example.com"
	        ),
	        license = @License(
	            name = "Apache 2.0",
	            url = "http://www.apache.org/licenses/LICENSE-2.0"
	        )
	    )
	)
public class SpringBootCrudWithMysqlDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudWithMysqlDatabaseApplication.class, args);
	}

}
