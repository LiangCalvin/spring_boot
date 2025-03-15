package com.sirapopb.app_sirapopb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppSirapopbApplication {

	public static void main(String[] args) {

		SpringApplication.run(AppSirapopbApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(String[] args){
		return runner->{
			System.out.println("Hi");
		};
	}

}
