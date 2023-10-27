package by.flameksandr.spring.boot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")//GET, POST, PUT
    public String hello() {
        return "Hello!!!!";
    }
}
