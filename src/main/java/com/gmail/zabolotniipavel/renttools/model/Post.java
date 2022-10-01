package com.gmail.zabolotniipavel.renttools.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
public class Post {
    @Id
    @GeneratedValue
    private Long postId;
    @NotEmpty
    private String title;

    @NotEmpty
    private String description;

    @ManyToOne
    @JoinColumn(name="userId", nullable=false)
    private User user;
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
    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
