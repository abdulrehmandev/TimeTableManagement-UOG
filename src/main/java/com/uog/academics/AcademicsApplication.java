package com.uog.academics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan( basePackages = {"com.uog.academics.controller"} )
public class AcademicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcademicsApplication.class, args);
	}

}
