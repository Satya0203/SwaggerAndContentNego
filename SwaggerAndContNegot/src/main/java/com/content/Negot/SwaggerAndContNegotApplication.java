package com.content.Negot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SwaggerAndContNegotApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerAndContNegotApplication.class, args);
	}
	public Docket api()
	{
		return new Docket(DocumentationType.SWAGGER_2);
	}

}
