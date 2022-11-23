package com.example.Kursovaya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.exemple.Kursovaya")
@SpringBootApplication
public class 	KursovayaApplication {
	public static void main(String[] args) {
		SpringApplication.run(KursovayaApplication.class, args);
	}
}
