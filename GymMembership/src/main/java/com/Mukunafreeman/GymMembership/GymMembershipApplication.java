package com.Mukunafreeman.GymMembership;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EntityScan
@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class GymMembershipApplication {

	public static void main(String[] args) {

		SpringApplication.run(GymMembershipApplication.class, args);
	}

}
