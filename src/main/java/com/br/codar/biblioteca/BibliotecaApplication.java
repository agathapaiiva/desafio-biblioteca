package com.br.codar.biblioteca;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BibliotecaApplication {
	 private static Logger LOGGER = Logger.getLogger("InfoLogging");

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);
		LOGGER.info("Started a Application - API BIBLIOTECA");
	}

}
