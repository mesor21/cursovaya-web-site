package com.example.Kursovaya;

import com.example.Kursovaya.person.Chelovek;
import com.example.Kursovaya.person.Repository.ChelovekRep;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KursovayaApplication {
	public static void main(String[] args) {
		SpringApplication.run(KursovayaApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(ChelovekRep repository){
		return args -> {
			repository.save(new Chelovek("Dima","M","123@123.com","234","admin"));

			Chelovek user = repository.findByEmail("123@123.com");
			System.out.println(user.getName()+" "+user.getSurename());
		};
	}
}







