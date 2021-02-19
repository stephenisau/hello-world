package com.example.helloworld.service;

import com.example.helloworld.dao.GreetingDao;
import com.example.helloworld.model.Greeting;

@Service 
public class GreetingService {
    
    private final GreetingDao greetingDao;

    /**
     * Binds our greeting data access layer to this greeting service.
     * @param greetingDao
     */
    @Autowired
    public GreetingService(@Qualifier("h2") GreetingDao greetingDao) {
        this.greetingDao = greetingDao;
    }

    /**
     * Implements greetingDao.insertGreeting to persist to DB.
     * @param greeting
     * @return
     */
    public int addGreeting(Greeting greeting) {
        return greetingDao.insertGreeting(greeting);
    }

    /**
     * 
     * @return
     */
    public List<Greeting> getAllGreeting() {
        return greetingDao.getAllGreeting();
    }
}