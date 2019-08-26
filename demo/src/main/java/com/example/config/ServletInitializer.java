package com.example.config;

import com.example.servlet.HelloServlet;
import com.example.servlet.LoginServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

//@Configuration
public class ServletInitializer implements ServletContextInitializer {
    private static final Logger logger = LoggerFactory.getLogger(WebAppInitializer.class);

    @Override
    public void onStartup(ServletContext container) throws ServletException {

        logger.info("------------------------------------");
        logger.info("Loading custom servlet");

        ServletRegistration.Dynamic servlet = container.addServlet(
                "HelloServlet", new HelloServlet());
        //LoadOnStartUp indicates an order for servlets to be loaded, servlets with higher numbers get loaded after servlets with lower numbers.
        servlet.setLoadOnStartup(1);
        //Servlet mapping pattern
        servlet.addMapping("/hello");

        /*************Test Add new Servlet ***********************/

        ServletRegistration.Dynamic servlet2 = container.addServlet(
                "LoginServlet", new LoginServlet());
        servlet2.setLoadOnStartup(2);
        servlet2.addMapping("/login");

        logger.info("Finished custom Servlet");
        logger.info("------------------------------------");
    }
}
