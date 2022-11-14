package com.masai.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SwaggerConfig {

	public static void main(String[] args) {
	      SpringApplication.run(SwaggerConfig.class, args);
	  }

	@Bean
	   public Docket productApi() {
	      return new Docket(DocumentationType.SWAGGER_2).select()
	         .apis(RequestHandlerSelectors.basePackage("com.masai")).build();
	   }
	
	private ApiInfo metaData() {
		return new ApiInfoBuilder()
				.title("Swagger")
				.description("\"Swagger Configuration\"")
				.version("1.1.0")
				.license("Apace 2.0")
				.licenseUrl("https://www.apache.org/license/LICENSE-2.0\"")
				.build();
	}
}
