package com.nttdata.bootcamp.debitcardservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DebitCardApplication {

	public static void main(String[] args) {
		SpringApplication.run(DebitCardApplication.class, args);
	}

}
