package com.example.helloworld.service;

import com.example.helloworld.dao.GreetingDao;
import com.example.helloworld.model.Greeting;

public class GreetingService {
    private final GreetingDao greetingDao;

    public GreetingService(GreetingDao greetingDao) {
        this.greetingDao = greetingDao;
    }

    public int addGreeting(Greeting greeting) {
        return greetingDao.addGreeting(greeting);
    }
}