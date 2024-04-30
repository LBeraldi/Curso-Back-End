package io.github.lberaldi.vendasBD;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages = {"io.github.lberaldi.vendasBD.repository"})
@RestController
public class VendasApplication {
@GetMapping("/hello")
	public String helloWorld(){
		return applicationNome;
	}

	@Value("${application.name}")
	private String applicationNome;

	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);

	}
}
