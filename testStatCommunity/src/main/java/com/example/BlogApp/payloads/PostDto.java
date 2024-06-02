package com.example.BlogApp.payloads;

import com.example.BlogApp.blog.entities.Category;
import com.example.BlogApp.blog.entities.Comment;
import com.example.BlogApp.blog.entities.User;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class PostDto {
    private Integer postId;
    private String title;
    private String content;
    private String imageName;
    private Date addedDate;

    private CategoryDto category;
    private UserDto user;

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    private Set<Comment> comments =new HashSet<>();

    public PostDto() {
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getImageName() {
        return imageName;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public CategoryDto getCategory() {
        return category;
    }

    public UserDto getUser() {
        return user;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public void setCategory(CategoryDto category) {
        this.category = category;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }
}
