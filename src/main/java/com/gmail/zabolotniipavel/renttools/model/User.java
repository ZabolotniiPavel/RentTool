package com.gmail.zabolotniipavel.renttools.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @NotEmpty
    private String userName;
    @NotEmpty
    private String mobileNumber;

    //private List<Offer> userPosts;

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
    /*public List<Offer> getUserPosts() {
        return userPosts;
    }

    public void setUserPosts(List<Offer> userPosts) {
        this.userPosts = userPosts;
    }
*/
}
