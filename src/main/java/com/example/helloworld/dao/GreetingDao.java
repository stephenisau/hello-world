package com.example.helloworld.dao;

import com.example.demo.model.Greeting;

import java.util.UUID;

public interface GreetingDao {
    int addContent(UUID id, Greeting content);
    
    default int addGreeting(Greeting greeting) {
        UUID id = UUID.randomUUID();
        return addContent(id, greeting);
    }
}