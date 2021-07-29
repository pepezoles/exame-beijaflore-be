package br.com.exame.movimentomanual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com.exame.movimentomanual.*")
public class MovimentoManualApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovimentoManualApplication.class, args);
	}

}
