package com.example.accessingdatarest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataRestApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(PersonajeRepository repository) {
		return args -> {
			if (repository.count() == 0) {
				repository.save(new Personaje(null, "Jinx", "Zaun", "Tiradora", "Caótica"));
				repository.save(new Personaje(null, "Vi", "Zaun", "Luchadora", "Buena"));
				repository.save(new Personaje(null, "Jayce", "Piltover", "Inventor", "Legal"));
				System.out.println("🎉 Personajes iniciales insertados");
			} else {
				System.out.println("ℹ️ Ya existen personajes en la base de datos");
			}
		};
	}
}
