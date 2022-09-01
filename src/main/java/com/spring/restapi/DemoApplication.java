package com.spring.restapi;

/**
 * @author Vijaya Bramarambika
 *August30, 2022
 * 
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.spring.restapi")
@SpringBootApplication
public class DemoApplication { 
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}