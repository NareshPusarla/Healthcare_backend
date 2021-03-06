package com.hospital.healthcare.swagger;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import io.swagger.models.Contact;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//import static springfox.documentation.builders.PathSelectors.regex;

//@Configuration
//@EnableSwagger2
//@ConfigurationProperties("app.api")
//@ConditionalOnProperty(name="app.api.swagger.enable", havingValue = "true", matchIfMissing = false)

public class SwaggerConfig {

//	private String version;
//	private String title;
//	private String description;
//	private String basePackage;
//	private String contactName;
//	private String contactEmail;

//	@Bean
//	public Docket api() {
//		
//		return new Docket(DocumentationType.SWAGGER_2).groupName("Java Patients Project").apiInfo(apiInfo()).select()
//				.paths(regex("/patient.*")).build();
//		
////		return new Docket(DocumentationType.SWAGGER_2)
////				.select()
////				.apis(RequestHandlerSelectors.basePackage(basePackage))
////				.paths(PathSelectors.any())
////				.build()
////				.directModelSubstitute(LocalDate.class, java.sql.Date.class)
////				.directModelSubstitute(LocalDateTime.class, java.util.Date.class);
//	}

//	private ApiInfo apiInfo() {
//		return new ApiInfoBuilder().title("Spring Boot Patient Application APIs").description("Application APIs").build();
//	}
}
