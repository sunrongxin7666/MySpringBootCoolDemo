package com.demos.srx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyspringbootcooldemoApplication {
	@RequestMapping("/")
	public String home(){
		return "Hi, there is a project based on Spring Boot";
	}

	public static void main(String[] args) {
		SpringApplication.run(MyspringbootcooldemoApplication.class, args);
	}
}
