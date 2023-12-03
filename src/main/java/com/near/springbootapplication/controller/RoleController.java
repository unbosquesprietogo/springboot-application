package com.near.springbootapplication.controller;

import com.near.springbootapplication.entity.Cliente;
import com.near.springbootapplication.entity.Permisos;
import com.near.springbootapplication.entity.Role;
import com.near.springbootapplication.service.ClienteService;
import com.near.springbootapplication.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/permisos/{rolename}")
    public ResponseEntity<?> getPermisosByRolename(@PathVariable String rolename) {
        try {
            List<Role> permisosList = roleService.getPermisosByRoleName(rolename);
            return ResponseEntity.status(HttpStatus.OK).body(permisosList);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al crear el cliente: " + e.getMessage());
        }
    }

}