package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

@Configuration
public class SwaggerConfig {


    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("dpi")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
                .build();
    }


    public ApiInfo apiInfo(){
        Contact contact = new Contact("dpi","","dpiops@dpi.net.cn");
        return new ApiInfo("Demo服务",
                "Demo API文档",
                "1.0", "urn:tos",null, "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<>());
    }
}
