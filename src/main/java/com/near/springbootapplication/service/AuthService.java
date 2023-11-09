package com.near.springbootapplication.service;

import com.near.springbootapplication.entity.user.LdapUserRepository;
import com.near.springbootapplication.model.consumer.response.AuthResponse;
import com.near.springbootapplication.model.consumer.request.LoginRequest;
import com.near.springbootapplication.model.consumer.request.RegisterRequest;
import com.near.springbootapplication.entity.user.User;
import com.near.springbootapplication.entity.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final LdapUserRepository ldapUserRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    @Autowired
    private LdapTemplate ldapTemplate;

    public AuthResponse loginDB(LoginRequest request) {

        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        UserDetails user=userRepository.findByUsername(request.getUsername()).orElseThrow();
        String token=jwtService.getToken(user);
        return AuthResponse.builder()
                .token(token)
                .build();

    }

    public AuthResponse loginLDAP (LoginRequest request){
        try {
            ldapTemplate.authenticate("", "(uid=" + request.getUsername() + ")", request.getPassword());
            UserDetails user=ldapUserRepository.findByUsername(request.getUsername()).orElseThrow();
            String token=jwtService.getToken(user);
            return AuthResponse.builder()
                    .token(token)
                    .build();

        } catch (Exception e) {
            return null;
        }
    }

    public AuthResponse register(RegisterRequest request) {
        User user = User.builder()
                .username(request.getUsername())
                .password(passwordEncoder.encode( request.getPassword()))
                .role(request.getRole())
                .build();

        userRepository.save(user);

        return AuthResponse.builder()
                .token(jwtService.getToken(user))
                .build();

    }

}
