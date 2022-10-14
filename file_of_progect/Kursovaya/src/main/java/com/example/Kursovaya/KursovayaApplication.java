package com.example.Kursovaya;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EntityScan(basePackages="com.example.Kursovaya")
public class KursovayaApplication {
	private static final Logger log = LoggerFactory.getLogger(KursovayaApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(KursovayaApplication.class, args);
	}
}







