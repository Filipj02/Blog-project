package com.example.blogproject.dao;

import com.example.blogproject.entity.Post;

public class test {
    public static void main(String[] args) {
        Post post = new Post("title", "description");
        Dao.save(post);


    }
}
