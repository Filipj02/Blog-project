package com.example.blogproject.dao;

import com.example.blogproject.entity.Comm;
import com.example.blogproject.entity.Post;

public class test {
    public static void main(String[] args) {
        Post post = new Post("title", "description");
        Dao.save(post);
        Comm comm = new Comm( post, "dsdsdsdsdsdsds", "DADADADADADADAD");
        Dao.save(comm);


    }
}
