package com.SearchForTalent.FindDev.Service;

import com.SearchForTalent.FindDev.Dto.Dto;
import com.SearchForTalent.FindDev.Entity.Post;
import com.SearchForTalent.FindDev.Repository.PostRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceImple implements com.SearchForTalent.FindDev.Service.Service {
    private final PostRepository postRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public ServiceImple(PostRepository postRepository, ModelMapper modelMapper) {
        this.postRepository = postRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<Dto> getAllPosts() {
        List<Post> posts = postRepository.findAll();
        return posts.stream()
                .map(post -> modelMapper.map(post, Dto.class))
                .collect(Collectors.toList());
    }

    @Override
    public Dto addPost(Dto dto) {
        Post post = modelMapper.map(dto, Post.class);
        Post savedPost = postRepository.save(post);
        return modelMapper.map(savedPost, Dto.class);
    }

    // Add other methods as needed
}