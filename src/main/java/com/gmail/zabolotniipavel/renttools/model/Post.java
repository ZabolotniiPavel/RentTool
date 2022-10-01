package com.gmail.zabolotniipavel.renttools.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotEmpty;

@Entity
public class Post {
    @Id
    @GeneratedValue
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
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

}
