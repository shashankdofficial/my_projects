package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class JwtProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtProjectApplication.class, args);
	}

}
