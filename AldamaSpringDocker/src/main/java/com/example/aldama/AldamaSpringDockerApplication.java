package com.example.aldama;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AldamaSpringDockerApplication {
	
	  @RequestMapping("/")
	  public String home() {
	    return "Hello Docker World I´m Alfredo ";
	  }

	public static void main(String[] args) {
		SpringApplication.run(AldamaSpringDockerApplication.class, args);
	}

}
