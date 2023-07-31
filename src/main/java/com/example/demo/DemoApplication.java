package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.*;
import java.util.*;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Properties properties = new Properties();
		try{
		Connection connection = DriverManager.getConnection
			("jdbc:sqlserver://pricedb07.database.windows.net:1433;database=Priceit","dbadmin@pricedb07", "Admin123");
	
		} catch(Exception e){
			System.out.println("connection established hopefully");
		}
	}
	@RequestMapping("/")
	String sayHello() {
		return "Hello Shankar!";
		
	}
}
