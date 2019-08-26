# learn-spring
This repository is for learning Spring 

### Init project

1. Go to https://start.spring.io/

2. Configure your project, for example add Spring MVC package

3. Download zip file and extract

4. Open project with Intellij 

### Fix problem 

Downgrade gradle version from 5 to 4 to solve gradel build failure

In gradle-wrapper.properties

`distributionUrl=https\://services.gradle.org/distributions/gradle-4.4-all.zip `


### Set up a Spring project

go to https://spring.io/guides/gs/spring-boot/

### Servlet Learning

#### java servlet

https://www.baeldung.com/intro-to-servlets 

Simply put, a Servlet is a class that handles requests, processes them and reply back with a response.

Servlets are under the control of another Java application called a Servlet Container. When an application running in a web server receives a request, the Server hands the request to the Servlet Container – which in turn passes it to the target Servlet.

Servlet Lifecycle

1. init()
The init method is designed to be called only once. If an instance of the servlet does not exist, the web container:

	Loads the servlet class
	Creates an instance of the servlet class
	Initializes it by calling the init method
	
2. service()

This method is only called after the servlet’s init() method has completed successfully.

The Container calls the service() method to handle requests coming from the client, interprets the HTTP request type (GET, POST, PUT, DELETE, etc.) and calls doGet, doPost, doPut, doDelete, etc. methods as appropriate

3. destroy()
Called by the Servlet Container to take the Servlet out of service.

Example Servlet Code
 
https://github.com/eugenp/tutorials/tree/master/javax-servlets/src/main/java/com/baeldung


#### Spring Servlet

https://www.baeldung.com/spring-xml-vs-java-config (https://github.com/eugenp/tutorials/tree/master/spring-mvc-java)

https://www.baeldung.com/register-servlet

https://docs.spring.io/spring/docs/4.3.12.RELEASE/spring-framework-reference/htmlsingle/

https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#spring-web

#### Spring Servlet Source Code

DispatcherServlet (get Bean and init all resolver and handler with bean)


extend FrameworkServlet (Set WebApplicationContext and set context attribute)


extend HttpServletBean


extend HttpServlet


#### Try to play with Serlvet

If run in intellij, it will default start a embbed tomcat. And if spring boot found mvc in dependency then it will load dispatcherServelt.

Embeded Spring dispatherServlet was lazy initialized. Only when call the  url, then it will initialized it.

Why WebapplicationInitializer can not be loaded -> must use local tomcat server
https://github.com/spring-projects/spring-boot/issues/522

Set local tomcat server
https://www.mkyong.com/intellij/intellij-idea-run-debug-web-application-on-tomcat/
https://tomcat.apache.org/download-80.cgi (download tomcat)
https://www.baeldung.com/register-servlet (Register Servlet by WebApplicationInitializer)

 Use ServletContextInitializer as configuration component to add custom Servlet (Work with JSP Web)
https://stackoverflow.com/questions/15385596/how-are-servlet-url-mappings-in-web-xml-used
https://stackoverflow.com/questions/20915528/how-can-i-register-a-secondary-servlet-with-spring-boot


