package com.aston.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AstonConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AstonConfigServerApplication.class, args);
	}

}
