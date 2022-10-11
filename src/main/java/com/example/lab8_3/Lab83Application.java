package com.example.lab8_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Lab83Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab83Application.class, args);
	}

}
