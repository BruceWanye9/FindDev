package com.SearchForTalent.FindDev.Service;

import com.SearchForTalent.FindDev.Dto.Dto;
import com.SearchForTalent.FindDev.Entity.Post;

import java.util.List;

public interface Service {
    List<Dto> getAllPosts();
    Dto addPost(Dto dto);
        // You can declare more methods as needed

}
