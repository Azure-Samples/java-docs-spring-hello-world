package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.*;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Connection connection = DriverManager.getConnection("jdbc:sqlserver://pricedb07.database.windows.net:1433;database=Priceit;user=dbadmin@pricedb07;password=Admin123;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
	}

	@RequestMapping("/")
	String sayHello() {
		return "Hello Shankar!";
		
	}
}
