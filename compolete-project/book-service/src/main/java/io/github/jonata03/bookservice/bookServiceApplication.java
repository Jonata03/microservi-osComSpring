package io.github.jonata03.bookservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class bookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(bookServiceApplication.class, args);
	}

}
