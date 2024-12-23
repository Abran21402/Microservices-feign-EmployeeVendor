package com.ust.vendor_services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients
public class VendorServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(VendorServicesApplication.class, args);
	}

}
