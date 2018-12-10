package ie.gmit.ds.client;

/*
com.ships -> don't change
com.ships.model -> models don't change
com.ships.controllers ->  controllers - request mappings
com.ships.repositories -> database
com.ships.security -> 
com.ships.services -> pass information from one to another
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
