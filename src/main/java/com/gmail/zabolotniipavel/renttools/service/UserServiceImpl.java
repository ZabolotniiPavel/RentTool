package com.gmail.zabolotniipavel.renttools.service;

import com.gmail.zabolotniipavel.renttools.model.User;
import com.gmail.zabolotniipavel.renttools.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    @Transactional
    public User save(User user) {
       return userRepository.save(user);
    }
}
