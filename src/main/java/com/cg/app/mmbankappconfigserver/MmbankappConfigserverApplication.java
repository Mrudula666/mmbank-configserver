package com.cg.app.mmbankappconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MmbankappConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MmbankappConfigserverApplication.class, args);
	}

}

