package com.example.blogproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity

@Table(name = "comm")
public class Comm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    private String username;

    private String description;

    public Comm() {
    }

    public Comm(Post post, String username, String description) {
        this.post = post;
        this.username = username;
        this.description = description;
    }
}