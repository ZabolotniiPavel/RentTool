package com.gmail.zabolotniipavel.renttools.service;


import com.gmail.zabolotniipavel.renttools.model.Post;
import com.gmail.zabolotniipavel.renttools.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;
    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }
}
