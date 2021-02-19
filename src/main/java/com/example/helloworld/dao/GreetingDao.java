package com.example.helloworld.dao;

import com.example.demo.model.Greeting;

import java.util.UUID;


/**
 * This GreetinDao interface has 2 methods to add a greeting.
 * The default method addGreeting: takes a greeting instance, generates a UUID
 * then returns our addContent method in the interface.
 */
public interface GreetingDao {

    int insertGreeting(UUID id, Greeting content);
    
    /**
     * Default behavior for this interface. Generates random UUID.
     * @param greeting
     * @return
     */
    default int addGreeting(Greeting greeting) {
        UUID id = UUID.randomUUID();
        return insertGreeting(id, greeting);
    }
}