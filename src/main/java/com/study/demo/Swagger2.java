package com.study.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;

import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.*;

@Configuration
@EnableSwagger2
public class Swagger2 {

    @Bean
    @Scope()
    public Docket creatRestApi(){

        Docket docket;
        docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.study.demo")).paths(any()).build();
        return docket;

    }

    private ApiInfo getApiInfo(){

        return new ApiInfoBuilder()
                .title("Demo")
                .description("开发接口文档")
                .termsOfServiceUrl("444")
                .contact("Ms.zheng")
                .version("1.0")
                .build();
    }

}
