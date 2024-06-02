package com.example.BlogApp.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;


public class UserDto {
    private int    id;
    @NotEmpty
    @Size(min=4, message="Username must be min of 4 character !!")
    private String name;
    @Email
    private String email;
    @NotEmpty
    @Size(min= 3, max =10,message="Password must be minimum of 3 chars and mx of 10 characters")
    private String password;
    @NotEmpty
    private String about;

    public UserDto() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAbout() {
        return about;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
