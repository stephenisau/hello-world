package com.example.helloworld.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;


public class Greeting {
    private UUID id;
    private String content;

    /**
     * Greeting constructor
     * @param id
     * @param content
     */
    public Greeting(@JsonProperty("id") UUID id, 
                    @JsonProperty("name") String content) {
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
     * Setter for id
     * @return
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Getter for content
     * @return
     */
    public String getContent() {
        return content;
    }

    /**
     * Setter for content
     */
    public void setContent(String content) {
        this.content = content;
    }

}