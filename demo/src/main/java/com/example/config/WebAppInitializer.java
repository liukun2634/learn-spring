package com.example.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

//WebApplicationInitializer will be discovered and bootstrapped by Spring boot(Not work in embeded tomcat, set local tomcat for application)
//ServletContextInitializer hence servlet will not be automatically bootstrapped by the Servlet container
public class WebAppInitializer implements WebApplicationInitializer {


    private static final Logger logger = LoggerFactory.getLogger(WebAppInitializer.class);

    @Override
    public void onStartup(ServletContext container) throws ServletException {
        //Init WebApplicationContext
        AnnotationConfigWebApplicationContext ctx
                = new AnnotationConfigWebApplicationContext();
        ctx.register(WebMvcConfigure.class);
        ctx.setServletContext(container);

        logger.info("------------------------------------");
        logger.info("Loading dispatcher Servlet");

        //Configure Servlet with WebApplicationContext
        ServletRegistration.Dynamic servlet = container.addServlet(
                "dispatcherServlet", new DispatcherServlet(ctx));
        //LoadOnStartUp indicates an order for servlets to be loaded, servlets with higher numbers get loaded after servlets with lower numbers.
        servlet.setLoadOnStartup(1);
        //Servlet mapping pattern
        servlet.addMapping("/");

        /*************Test Add new Servlet ***********************/

//        ServletRegistration.Dynamic servlet2 = container.addServlet(
//                "dispatcherServlet2", new DispatcherServlet(ctx));
//        servlet2.setLoadOnStartup(2);
//        servlet2.addMapping("/path/*");
//
//        ServletRegistration.Dynamic servlet3 = container.addServlet(
//                "dispatcherServlet3", new DispatcherServlet(ctx));
//        servlet3.setLoadOnStartup(3);
//        servlet3.addMapping("/path");


        logger.info("Finished dispatcher Servlet");
        logger.info("------------------------------------");
    }
}
