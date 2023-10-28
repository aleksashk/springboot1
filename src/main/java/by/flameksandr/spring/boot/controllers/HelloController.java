package by.flameksandr.spring.boot.controllers;

import by.flameksandr.spring.boot.dto.Person;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return "Hello " + name + "!";
    }

    @PostMapping(path = "/goodbye")
    public String goodbye(@RequestBody Person p) {
        return "Goodbye, " + p.getName() + "!";
    }

    @GetMapping("/get")
    public Person getPerson() {
        Person person = new Person();
        person.setName("Patrick");
        return person;
    }

    @GetMapping("/getall")
    public List<Person> getAllPersons() {
        Person person1 = new Person();
        person1.setName("Patrick");
        Person person2 = new Person();
        person2.setName("Jessika");
        return Arrays.asList(person1, person2);
    }

    @GetMapping("/statustest")
    public Person statusTest(HttpServletResponse response) {
        Person person1 = new Person();
        person1.setName("Patrick");
        response.setStatus(HttpServletResponse.SC_ACCEPTED);
        return person1;
    }
}
