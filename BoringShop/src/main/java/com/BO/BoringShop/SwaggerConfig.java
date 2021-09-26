package com.BO.BoringShop;

import java.util.Collections;
import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;//clase de springfox
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig{
	//https://es.quora.com/Qu%C3%A9-es-Spring-Beans
	@Bean
	public Docket apiDocket() {
		return new Docket (DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.BO.BoringShop"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(getApiInfo());
	}
	private ApiInfo getApiInfo(){ 
		return new ApiInfo(
				"Order Service API",
				"Order Service API Description",
				"1.0",
				"http://codmind.com/terms",
				new Contact("Codmind", "https://codmind.com", "apis@codmind.com"),
				"LICENSE",
				"LICENSE URL",
				Collections.emptyList()
				);
	}
}