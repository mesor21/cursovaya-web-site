package com.example.Kursovaya;



import com.example.Kursovaya.person.Admin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class KursovayaApplication {
	public static void main(String[] args) {
		SpringApplication.run(KursovayaApplication.class, args);
		//Admin test = new Admin("Dima","M","12@12.com","4321");
	}
}







