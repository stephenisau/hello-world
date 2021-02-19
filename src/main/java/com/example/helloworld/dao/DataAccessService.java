package com.example.helloworld.dao;

import com.example.demo.model.Greeting;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DataAccessService implements GreetingDao {
    private static List<Greeting> DB = new ArrayList<>();
    
    @Override
    public int insertGreeting(UUID id, Greeting greeting) {
        DB.add(new Greeting(id, greeting.getContent()));
        return 1;
    }
}