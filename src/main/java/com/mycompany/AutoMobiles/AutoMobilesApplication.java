package com.mycompany.AutoMobiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutoMobilesApplication {

	public static void main(String[] args) {
		System.setProperty("server.port","8083");
		SpringApplication.run(AutoMobilesApplication.class, args);
	}

}
