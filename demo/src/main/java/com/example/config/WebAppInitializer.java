package com.example.config;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

@Configuration
//Change from WebApplicationInitializer to SevletContextInitializer for Spring boot to discovery
public class WebAppInitializer implements ServletContextInitializer {

    @Override
    public void onStartup(ServletContext container) throws ServletException {
        AnnotationConfigWebApplicationContext ctx
                = new AnnotationConfigWebApplicationContext();
        ctx.register(WebMvcConfigure.class);
        ctx.setServletContext(container);

        System.out.println("------------------------------------");
        System.out.print("Loading dispatcher");
        //Init dispatherServlet with WebApplicationContext
        ServletRegistration.Dynamic servlet = container.addServlet(
                "dispatcherExample", new DispatcherServlet(ctx));
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
    }
}
