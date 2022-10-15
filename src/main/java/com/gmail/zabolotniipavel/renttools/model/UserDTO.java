package com.gmail.zabolotniipavel.renttools.model;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserDTO {
    public String userName;
    public String mobileNumber;
    public String password;

    private final static PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    public UserDTO(String userName, String mobileNumber, String password) {
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.password = passwordEncoder.encode(password);
    }

    public User getUser() {
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        user.setMobileNumber(mobileNumber);
        return user;
    }
}
