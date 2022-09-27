package com.gmail.zabolotniipavel.renttools.model;

import javax.validation.constraints.NotEmpty;
import java.util.List;

public class User {
    @NotEmpty
    private String userName;
    @NotEmpty
    private String mobileNumber;

    private List<Post> userPosts;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public List<Post> getUserPosts() {
        return userPosts;
    }

    public void setUserPosts(List<Post> userPosts) {
        this.userPosts = userPosts;
    }

}
