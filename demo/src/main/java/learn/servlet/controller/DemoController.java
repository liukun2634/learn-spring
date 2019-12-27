package learn.servlet.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/path")
    public String path() {
        return "Path";
    }

    @RequestMapping("/path/abc")
    public String pathAbc() {
        return "PathAbc";
    }

    @RequestMapping("/path/")
    public String pathSlash() { return "PathSlash"; }

}
