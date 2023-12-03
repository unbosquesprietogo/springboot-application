package com.near.springbootapplication.controller;

import com.near.springbootapplication.entity.Permisos;
import com.near.springbootapplication.service.PermisosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/permisos")
public class PermisosController {

    @Autowired
    private PermisosService permisosService;

    @GetMapping("/{rolename}")
    public ResponseEntity<?> getPermisosByRolename(@PathVariable String rolename) {

        try {
            List<Permisos> permisosList = permisosService.getPermisosByRoleName(rolename);
            return ResponseEntity.status(HttpStatus.OK).body(permisosList);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al crear el cliente: " + e.getMessage());
        }
    }
}
