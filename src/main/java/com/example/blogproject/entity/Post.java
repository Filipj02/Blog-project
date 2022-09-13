package com.example.blogproject.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Entity
@Table(name = "post")
public class Post {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)

    private Long id;


    @Column(nullable = false, unique = true)
    private String title;


    @Column(nullable = false, length = 3000)
    private String description;


    public Post(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Post() {
    }
}