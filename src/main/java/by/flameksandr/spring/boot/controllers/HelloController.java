package by.flameksandr.spring.boot.controllers;

import by.flameksandr.spring.boot.dto.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return "Hello " + name + "!";
    }

    @PostMapping(path="/goodbye")
    public String goodbye(@RequestBody Person p){
        return "Goodbye, " + p.getName() + "!";
    }
}
