package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("The sum of a and b is " + c);
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	String sayHello() {
		return "Hello World, This is Azure talking to U!";
	}

	@RequestMapping("/")
	String sayYes() {
		return " The sum of a and b is 30 ";
	}
}
