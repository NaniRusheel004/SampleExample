package org.example3.mongoapiexample2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Mongoapiexample2Application {

	public static void main(String[] args) {
		SpringApplication.run(Mongoapiexample2Application.class, args);
	}

}
