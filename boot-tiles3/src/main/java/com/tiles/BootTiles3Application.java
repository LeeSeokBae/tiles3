package com.tiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.tiles" })
public class BootTiles3Application {

	public static void main(String[] args) {
		SpringApplication.run(BootTiles3Application.class, args);
	}
}
