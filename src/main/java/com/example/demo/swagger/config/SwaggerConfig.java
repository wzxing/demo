package com.example.demo.swagger.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

    public Docket docket() {
        return  new Docket(DocumentationType.SWAGGER_2).enable(false);
    }
}
