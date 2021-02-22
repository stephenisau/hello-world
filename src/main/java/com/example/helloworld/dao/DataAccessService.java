package com.example.helloworld.dao;

import com.example.helloworld.model.Greeting;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("h2")
public class DataAccessService implements GreetingDao {

    /**
     * "In-memory cache"
     */
    private static List<Greeting> DB = new ArrayList<>();

    /**
     * Override default addGreeting method behavior in our GreetingDao interface
     * @param id
     * @param greeting
     * @return
     */
    @Override
    public int insertGreeting(UUID id, Greeting greeting) {
        try {
            DB.add(new Greeting(id, greeting.getContent()));
            return 1;
        } catch (Exception e) {
            System.out.println("Something went wrong!");
            return 0;
        }
    }

    /**
     * Override selectAllGreeting method in GreetingDao interface
     * Returns data from persisted db layer
     */
    @Override
    public List<Greeting> selectAllGreeting() {
        return DB;
    }

    /**
     * Overrides getDefaultJsonGreeting method in GreetingDao interface.
     * Returns instance of greeting with UUID
     */
    @Override
    public Greeting getDefaultJsonGreeting() {
        UUID id = UUID.randomUUID();
        return new Greeting(id, "hello world");
    }
}