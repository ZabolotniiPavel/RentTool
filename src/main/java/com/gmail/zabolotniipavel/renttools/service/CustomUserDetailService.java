package com.gmail.zabolotniipavel.renttools.service;

import com.gmail.zabolotniipavel.renttools.model.CustomUserDetail;
import com.gmail.zabolotniipavel.renttools.model.User;
import com.gmail.zabolotniipavel.renttools.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username);
        if(user == null){
            throw new UsernameNotFoundException(username);
        }
        return new CustomUserDetail(user);
    }
}
