package com.socialnetworkapp.gossipi.Repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.socialnetworkapp.gossipi.Entity.Post;

@Repository
public interface PostRepo extends CrudRepository<Post, Integer> {
    Post save(Post post);
    ArrayList<Post> findAll();
}
