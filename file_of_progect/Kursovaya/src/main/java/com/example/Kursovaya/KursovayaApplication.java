package com.example.Kursovaya;


import com.example.Kursovaya.person.Chelovek;
import com.example.Kursovaya.person.ChelovekRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EntityScan(basePackages="com.example.Kursovaya")
public class KursovayaApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(KursovayaApplication.class, args);
		context.refresh();

		ChelovekRepository rep = context.getBean(ChelovekRepository.class);
		
		rep.save(new Chelovek("Dima","M","123@123","567","admin"));

	}
}







