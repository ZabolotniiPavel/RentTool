package com.gmail.zabolotniipavel.renttools.model;

import javax.validation.constraints.NotEmpty;

public class User {
    @NotEmpty
    private String userName;
    @NotEmpty
    private String mobileNumber;

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
}
