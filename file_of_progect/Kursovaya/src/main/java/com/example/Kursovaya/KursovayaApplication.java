package com.example.Kursovaya;

import com.example.Kursovaya.logic.Chelovek;
import com.example.Kursovaya.logic.Repository.ChelovekRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.exemple.Kursovaya")
@SpringBootApplication
public class KursovayaApplication {

	@Bean
	CommandLineRunner init(ChelovekRepository chelovekRepository){
		Chelovek firstAdmin = chelovekRepository.save(new Chelovek("Dima","M","admin@mail.com","pass","admin",null));
		return null;
	}
	public static void main(String[] args) {
		SpringApplication.	run(KursovayaApplication.class, args);
	}
}
