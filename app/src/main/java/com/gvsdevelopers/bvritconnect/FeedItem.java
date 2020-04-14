package com.gvsdevelopers.bvritconnect;

import java.util.Date;

public class FeedItem {
    private String title;
    private String description;
    private int priority;

    public FeedItem() {
        //empty constructor needed
    }

    public FeedItem(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}