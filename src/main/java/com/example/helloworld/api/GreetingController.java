package com.example.helloworld.api;

public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void addGreeting(Greeting greeting) {
        greetingService.addGreeting(greeting);
    }
}