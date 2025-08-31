package me.dio.santander_bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server URL")})
@SpringBootApplication
public class SantanderBootcampApplication {

	public static void main(String[] args) {
		SpringApplication.run(SantanderBootcampApplication.class, args);
	}

}
c