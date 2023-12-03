package com.near.springbootapplication.controller;


import com.near.springbootapplication.entity.Ciudad;
import com.near.springbootapplication.service.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CiudadController {

    @Autowired
    private final CiudadService ciudadService;


    public CiudadController(CiudadService ciudadService) {
        this.ciudadService = ciudadService;
    }

    @GetMapping("/ciudad")
    public ResponseEntity<?> obtenerCiudades() {
        try {
            List<Ciudad> ciudades = ciudadService.obtenerCiudades();
            return ResponseEntity.ok(ciudades);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al obtener las ciudades: " + e.getMessage());
        }
    }
}