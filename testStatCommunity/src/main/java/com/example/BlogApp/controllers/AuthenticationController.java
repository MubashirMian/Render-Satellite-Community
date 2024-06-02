package com.example.BlogApp.controllers;

import com.example.BlogApp.blog.entities.User;
import com.example.BlogApp.payloads.JwtAuthResponse;
import com.example.BlogApp.security.AuthenticationService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    private final AuthenticationService authSerive;

    public AuthenticationController(AuthenticationService authSerive) {
        this.authSerive = authSerive;
    }
    @PostMapping("/register")
    public ResponseEntity<JwtAuthResponse> register(
            @RequestBody User request){
        return ResponseEntity.ok(authSerive.register(request));
    }
    @PostMapping("/login")
    public ResponseEntity<JwtAuthResponse> login(
            @RequestBody User request)
    {
        return ResponseEntity.ok(authSerive.authenticationResponse(request));
    }

}