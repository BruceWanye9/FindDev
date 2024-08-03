package com.SearchForTalent.FindDev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "com.SearchForTalent.FindDev.Repository")


@SpringBootApplication
public class FindDevApplication {

	public static void main(String[] args) {
		SpringApplication.run(FindDevApplication.class, args);
	}

}
