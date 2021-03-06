package com.sdi.test.spring.cloud.acquisition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AcquisitionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcquisitionApplication.class, args);
	}

} 

