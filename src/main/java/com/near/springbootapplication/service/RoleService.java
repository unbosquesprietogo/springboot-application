package com.near.springbootapplication.service;

import com.near.springbootapplication.entity.Permisos;
import com.near.springbootapplication.entity.Role;
import com.near.springbootapplication.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getPermisosByRoleName(String roleName) {

        List<Role> permisos = roleRepository.findByPermisos_Roles_RoleName(roleName);

        if (permisos != null) {
          return permisos;
        } else {
            return Collections.emptyList();
        }
    }
}


