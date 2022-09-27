package com.gmail.zabolotniipavel.renttools.model;

import javax.validation.constraints.NotEmpty;

public class Post {
    private Long Id;
    @NotEmpty
    private String title;



    @NotEmpty
    private String description;
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

}
