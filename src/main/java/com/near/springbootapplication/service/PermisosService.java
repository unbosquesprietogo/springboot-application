package com.near.springbootapplication.service;

import com.near.springbootapplication.entity.Permisos;
import com.near.springbootapplication.entity.Role;
import com.near.springbootapplication.repository.PermisosRepository;
import com.near.springbootapplication.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermisosService {

    @Autowired
    private PermisosRepository permisosRepository;

    public List<Permisos> getPermisosByRoleName(String roleName) {

        List<Permisos> permisos = permisosRepository.findByRoles_RoleName(roleName);
        return permisos;
    }
}