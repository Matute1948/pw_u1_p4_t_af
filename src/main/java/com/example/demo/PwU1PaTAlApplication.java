package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PwU1PaTAlApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PwU1PaTAlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo tarea3");
		//Como cambio un rombo
		for (int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
			
			
		}
		
	}

}
