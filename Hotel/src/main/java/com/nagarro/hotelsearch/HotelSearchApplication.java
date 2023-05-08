package com.nagarro.hotelsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HotelSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelSearchApplication.class, args);
	}

	/*@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}*/
	
}
