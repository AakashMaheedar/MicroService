package com.freshworks.com.domain;

public class Micro
{

    private final long id;
    private final String content;

    public Micro(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
