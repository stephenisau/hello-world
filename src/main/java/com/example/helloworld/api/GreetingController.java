package com.example.helloworld.api;

import com.example.helloworld.model.Greeting;
import com.example.helloworld.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class GreetingController {
    private final GreetingService greetingService;

    /**
     * Set our greetingService instance to be the greetingService.
     * @Autowired for dependency injection
     * @param greetingService
     */
    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    /**
     * Add greeting instance to our greeting service.
     * Implements addGreeting method on our greetingService class
     * @param greeting
     */
    @PostMapping("/greeting")
    public void addGreeting(@RequestBody Greeting greeting) {
        greetingService.addGreeting(greeting);
    }

    @GetMapping
    public List<Greeting> getAllGreeting() {
        return greetingService.getAllGreeting();
    }
}