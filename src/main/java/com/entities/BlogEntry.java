package com.entities;

/**
 * Created by pardus on 12/28/16.
 */
public class BlogEntry {
    public BlogEntry() {
    }

    public BlogEntry(String title) {
        this.title = title;
    }

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
