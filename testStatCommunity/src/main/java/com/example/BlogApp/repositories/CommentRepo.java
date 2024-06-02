package com.example.BlogApp.repositories;

import com.example.BlogApp.blog.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo  extends JpaRepository<Comment,Integer> {

}
