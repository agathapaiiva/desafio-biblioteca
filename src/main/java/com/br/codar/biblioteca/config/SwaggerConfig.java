package com.br.codar.biblioteca.config;

import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	 public SwaggerConfig() {
	    }

	    @Bean
	    public Docket apis() {
	        return (new Docket(DocumentationType.SWAGGER_2)).select().apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build().apiInfo(this.apiInfo());
	    }

	    private ApiInfo apiInfo() {
	        return new ApiInfo("API REST - BIBLIOTECA", "Descrição", "1.0", "Termos de serviço", new Contact("Agatha", "agathapaiva.com.br", "agathapaiva@gmail.com"), "Licença", "URL da licença", new ArrayList());
	    }
}

