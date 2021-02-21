package com.example.helloworld.dao;

import com.example.helloworld.model.Greeting;

import java.util.UUID;
import java.util.List;
import java.util.Objects;
// import org.json.simple.JSONObject;

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

    List<Greeting> selectAllGreeting();
}