package com.gmail.zabolotniipavel.renttools.repository;

import com.gmail.zabolotniipavel.renttools.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
