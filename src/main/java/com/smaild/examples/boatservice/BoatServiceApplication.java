package com.smaild.examples.boatservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BoatServiceApplication {

	@GetMapping("/health")
	public String health() {
		return "it works!!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(BoatServiceApplication.class, args);
	}
	
}
