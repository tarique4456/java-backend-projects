package com.hcl.spring_boot_crud_with_mysql_database.security;



import java.lang.reflect.Method;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration {

	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpRequest ) {
		
		httpRequest.csrf(c->c.disable())
		.authorizeHttpRequests(auth->
		auth.requestMatchers(HttpMethod.POST).permitAll()
						.anyRequest().authenticated())
		.httpBasic(Customizer.withDefaults());
		
		return httpRequest.build();
	}
}
