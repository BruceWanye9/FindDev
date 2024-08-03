package com.SearchForTalent.FindDev.Repository;

import com.SearchForTalent.FindDev.Entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
