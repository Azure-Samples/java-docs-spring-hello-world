package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	String sayHello() {
		return "Hello Again!";
	}
}

public class DatabaseConnection {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:postgresql://familyrecipes.postgres.database.azure.com:5432/{your_database}?user=fryees&password={your_password}&sslmode=require";
        String username = "fryees@familyrecipes";
        String password = "BENTLEYbear555!";


		try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the PostgreSQL database successfully!");
            // Use the connection to query the database or perform other operations
            // ...
            connection.close();
        } catch (SQLException e) {
            System.out.println("Failed to connect to the PostgreSQL database: " + e.getMessage());
        }
    }
}


