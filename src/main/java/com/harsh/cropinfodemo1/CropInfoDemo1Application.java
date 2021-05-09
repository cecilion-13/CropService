package com.harsh.cropinfodemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CropInfoDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(CropInfoDemo1Application.class, args);
	}

}
