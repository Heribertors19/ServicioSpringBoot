package com.api.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				// Permitir todos los orígenes, métodos y encabezados
				registry.addMapping("/producto/**")  // Aplicar a todas las rutas bajo "/producto/"
						.allowedOrigins("*")  // Permitir todos los orígenes
						.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  // Permitir métodos comunes
						.allowedHeaders("*");  // Permitir todos los encabezados
			}
		};
	}
}
