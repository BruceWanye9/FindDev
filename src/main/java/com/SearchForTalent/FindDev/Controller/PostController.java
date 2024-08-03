package com.SearchForTalent.FindDev.Controller;

import com.SearchForTalent.FindDev.Dto.Dto;
import com.SearchForTalent.FindDev.Service.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    private final Service postService;

    public PostController(Service postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public List<Dto> getAllPosts() {
        return postService.getAllPosts();
    }

    @PostMapping("/add")
    public Dto addPost(@RequestBody Dto postDto) {
        return postService.addPost(postDto);
    }

    // Additional endpoints can be added here if needed, e.g., update, delete
}
