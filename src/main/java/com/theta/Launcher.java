package com.theta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the application. Nothing important here.
 * 
 * @author Sunil
 */
@EnableAutoConfiguration
@SpringBootApplication
public class Launcher {

	public static void main(String[] args) {
		SpringApplication.run(Launcher.class, args);
	}
}
