package br.com.zupacademy.bruno.trasancao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class TrasancaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrasancaoApplication.class, args);
	}

}
