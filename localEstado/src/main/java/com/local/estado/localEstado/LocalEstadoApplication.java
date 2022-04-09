package com.local.estado.localEstado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class LocalEstadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocalEstadoApplication.class, args);
	}

}
