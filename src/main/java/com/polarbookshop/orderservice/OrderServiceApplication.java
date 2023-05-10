package com.polarbookshop.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class OrderServiceApplication {

	public static void main(String[] args) {
		int secondsToSleep = 5;
		try {	
			Thread.sleep(secondsToSleep * 1000);
		} catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
		}
		SpringApplication.run(OrderServiceApplication.class, args);
	}

}
