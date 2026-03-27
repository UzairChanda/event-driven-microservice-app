package com.lcwu.hotelNexus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HotelNexusApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelNexusApplication.class, args);
	}

}
