package dev.ying.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @EnableAutoConfiguration(exclude = { MongoAutoConfiguration.class }) // ignore mongodb auto configuration
// @RestController
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	// @GetMapping("/") // an example about how to match request path
	// public String apiRoot() {
	// return "Hello world!";
	// }

}
