package com.spring.restapi;

/**
 * @author Vijaya Bramarambika
 *August30, 2022
 * 
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.spring.restapi")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DemoApplication { 
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
