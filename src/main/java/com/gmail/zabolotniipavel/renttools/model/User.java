package com.gmail.zabolotniipavel.renttools.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long userId;
    @NotEmpty
    private String userName;
    @NotEmpty
    private String mobileNumber;

    @NotEmpty
    private String password;
    @OneToMany(mappedBy="user")
    private Set<Post> posts;


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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
