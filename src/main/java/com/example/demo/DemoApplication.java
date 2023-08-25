package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// @RequestMapping("/")
	// String sayHello() {
	// 	return "Hello Azure!!";
	// }


	@GetMapping("/")
	public String index() {
		return "index";
	}

	@PostMapping("/upload")
	public String uploadFile(@RequestParam("file") MultipartFile file, Model model) {
		if (file.isEmpty()) {
			model.addAttribute("message", "Please select a file to upload.");
			return "index";
		}

		try {
			// Handle file upload logic here
			// You can use the file.getInputStream() to read the file data
			// Save the file to your desired location or cloud storage

			model.addAttribute("message", "File uploaded successfully.");
		} catch (Exception e) {
			model.addAttribute("message", "Error uploading file.");
		}

		return "index";
	}
}
