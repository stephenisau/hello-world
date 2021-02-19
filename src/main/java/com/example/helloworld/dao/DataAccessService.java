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
        DB.add(new Greeting(id, greeting.getContent()));
        return 1;
    }

    // @Override
    // public List<Greeting> selectAllGreeting() {
    //     return DB;
    // }
}