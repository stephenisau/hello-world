package com.example.helloworld.model;

import java.util.UUID;

public class Greeting {
    private final UUID id;
    private final String content;

    /**
     * Greeting constructor
     * @param id
     * @param content
     */
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    /**
     * Getter for id 
     * @return
     */
    public UUID getId() {
        return id;
    }

    /**
     * Getter for content
     * @return
     */
    public String getContent() {
        return content;
    }
}