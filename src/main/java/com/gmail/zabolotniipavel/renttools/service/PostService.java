package com.gmail.zabolotniipavel.renttools.service;

import com.gmail.zabolotniipavel.renttools.model.Post;

import java.util.List;

public interface PostService {
    Post save(Post post);
    List<Post> findAll();
}
