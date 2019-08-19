package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class CustomServletApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(new Class[] { CustomServletApplication.class, WebApplicationInitializer.class }, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CustomServletApplication.class);
    }

}