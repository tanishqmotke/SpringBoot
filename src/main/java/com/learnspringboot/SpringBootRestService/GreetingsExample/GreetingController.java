package com.learnspringboot.SpringBootRestService.GreetingsExample;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//“@RestController” annotation tells the Spring Boot that here is the implementation
// for our REST requests (GET/PUT/POST/DELETE)

//to make it a controller and to infrom SPRING we have to give the annotation
@RestController
public class GreetingController {
@Autowired
Greeting greeting;

AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name")String name)
    {
        greeting.setId(counter.incrementAndGet());
        greeting.setContent("Hey I am learning Spring Boot from "+ name);
        return greeting;
        //Developed an API
    }
}
