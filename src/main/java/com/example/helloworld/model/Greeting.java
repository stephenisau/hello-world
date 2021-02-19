package com.example.helloworld.model;

import java.util.UUID;

public class Greeting {
    private final UUID id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public UUID getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}