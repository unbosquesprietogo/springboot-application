package com.near.springbootapplication.service;

import com.near.springbootapplication.entity.Role;
import com.near.springbootapplication.model.response.AuthResponse;
import com.near.springbootapplication.model.request.LoginRequest;
import com.near.springbootapplication.model.request.RegisterRequest;
import com.near.springbootapplication.entity.Usuario;
import com.near.springbootapplication.repository.RoleRepository;
import com.near.springbootapplication.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UsuarioRepository usuarioRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final RoleRepository roleRepository;


    public AuthResponse loginDB(LoginRequest request) {

        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        UserDetails user= usuarioRepository.findByUsername(request.getUsername()).orElseThrow();
        String token=jwtService.getToken(user);
        return AuthResponse.builder()
                .token(token)
                .build();

    }



    public AuthResponse register(RegisterRequest request) {

        Role role = roleRepository.findById(request.getIdRole())
                .orElseThrow(() -> new RuntimeException("Role not found with id: " + request.getIdRole()));

        Usuario user = Usuario.builder()
                .username(request.getUsername())
                .password(passwordEncoder.encode( request.getPassword()))
                .role(role)
                .build();

        usuarioRepository.save(user);

        return AuthResponse.builder()
                .token(jwtService.getToken(user))
                .build();

    }

}
