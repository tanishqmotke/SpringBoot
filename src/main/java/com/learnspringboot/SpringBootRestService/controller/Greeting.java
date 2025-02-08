package com.learnspringboot.SpringBootRestService.controller;

import org.springframework.stereotype.Component;

@Component // With this annotation springboot understands that it is a bean 
public class Greeting {

    private long id;
    private String content;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
