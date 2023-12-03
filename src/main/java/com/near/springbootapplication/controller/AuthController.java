package com.near.springbootapplication.controller;

import com.near.springbootapplication.model.response.AuthResponse;
import com.near.springbootapplication.service.AuthService;
import com.near.springbootapplication.model.request.LoginRequest;
import com.near.springbootapplication.model.request.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ldap.core.DirContextAdapter;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.query.LdapQueryBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    @Autowired
    private LdapTemplate ldapTemplate;

    private final AuthService authService;
    @PostMapping(value ="/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request){
        return ResponseEntity.ok(authService.loginDB(request));
    }

    /*@PostMapping(value ="/login/ldap")
    public ResponseEntity<AuthResponse> loginLDAP(@RequestBody LoginRequest request){
        return ResponseEntity.ok(authService.loginLDAP(request));
    }*/

    @PostMapping(value ="/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(authService.register(request));
    }

    @GetMapping("/ldap")
    public String testLdapConnection() {
        try {
            ldapTemplate.authenticate("", "(objectclass=*)", null);
            return "Conexión exitosa";
        } catch (Exception e) {
            return "Error en la conexión: " + e.getMessage();
        }
    }


}
