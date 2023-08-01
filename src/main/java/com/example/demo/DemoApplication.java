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
		
		
	}
	@RequestMapping("/")
	String sayHello() {
		String connectionUrl =
                "jdbc:sqlserver://pricedb07.database.windows.net:1433;database=Priceit;user=dbadmin@pricedb07;password={your_password_here};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
		String query = "Select * from First where col1='Name1'";
		String result;
		try{
		Connection connection = DriverManager.getConnection(connectionUrl);
		Statement statement = connection.createStatement();
		
		ResultSet resultSet = statement.executeQuery(query);

		result = resultSet.getString(1);
	
		} catch(Exception e){
			System.out.println("connection established hopefully");
		}
		return "Hello Shankar!" + result;
		
	}
}
