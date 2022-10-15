package com.gmail.zabolotniipavel.renttools.repository;

import com.gmail.zabolotniipavel.renttools.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}
