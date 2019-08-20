package com.example.demo;

import com.example.config.ServletInitializer;
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
        //Add custom serlvet and start
        SpringApplication.run(new Class[] { CustomServletApplication.class, ServletInitializer.class }, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CustomServletApplication.class);
    }

}