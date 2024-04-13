package com.example.tributosV2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.tributosV2")
public class TributosV2Application {
	public static void main(String[] args) {
		SpringApplication.run(TributosV2Application.class, args);
	}

}
