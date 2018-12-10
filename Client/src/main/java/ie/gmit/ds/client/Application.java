package ie.gmit.ds.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Kamila The SpringApplication class provides a convenient way to
 *         bootstrap a Spring application that is started from a main() method.
 */

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
