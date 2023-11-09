package com.near.springbootapplication.controller;

import com.near.springbootapplication.model.consumer.response.AuthResponse;
import com.near.springbootapplication.service.AuthService;
import com.near.springbootapplication.model.consumer.request.LoginRequest;
import com.near.springbootapplication.model.consumer.request.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;
    @PostMapping(value ="/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request){
        return ResponseEntity.ok(authService.loginDB(request));
    }

    @PostMapping(value ="/login/ldap")
    public ResponseEntity<AuthResponse> loginLDAP(@RequestBody LoginRequest request){
        return ResponseEntity.ok(authService.loginLDAP(request));
    }

    @PostMapping(value ="/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(authService.register(request));
    }

}
