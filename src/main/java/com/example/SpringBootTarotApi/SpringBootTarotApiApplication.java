package com.example.SpringBootTarotApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTarotApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTarotApiApplication.class, args);
	}

}

// http://localhost:8080/tarot?card=Empress
// http://localhost:8080/tarot?card=hanged%20man