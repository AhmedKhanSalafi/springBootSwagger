package com.example.swagger_springBoot;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class SwaggerSpringBootApplication {

	public static void main(String[] args) {

		SpringApplication.run(SwaggerSpringBootApplication.class, args);
	}
	@Bean
	public GroupedOpenApi publicApi() {
		return GroupedOpenApi.builder()
				.group("Rjay Technology-public")
				.pathsToMatch("/public/**")
				.build();
	}


	@Bean
	public OpenAPI springShopOpenAPI() {
		return new OpenAPI()
				.info(new Info().title("Rjay Technology")
						.description("Rjay Technology sample application")
						.version("v0.0.1")
						.license(new License().name("Apache 2.0").url("https://github.com/AhmedKhanSalafi")))
				.externalDocs(new ExternalDocumentation()
						.description("Rjay Technology Wiki Documentation")
						.url("https://github.com/AhmedKhanSalafi"));
	}


}
