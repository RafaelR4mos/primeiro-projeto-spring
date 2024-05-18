package br.com.rafael.primeiroprojetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.rafael")
public class PrimeiroProjetoSpring {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoSpring.class, args);
	}

}
