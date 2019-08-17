package com.example.demo;

import com.example.config.WebAppInitializer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@SpringBootApplication
//@SpringBootApplication = @Configuration+  @ComponentScan + @EnableAutoConfiguration
//@Configuration
//@ComponentScan
//@EnableAutoConfiguration
public class DemoApplication {

	public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class,args);
	    SpringApplication.run(new Class[] {DemoApplication.class,WebAppInitializer.class}, args);

	}

	//Print all the beans in name order
//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//		return args -> {
//
//			System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for (String beanName : beanNames) {
//				System.out.println(beanName);
//			}
//
//		};
//	}
}
