package com.near.springbootapplication.controller;

import com.near.springbootapplication.entity.Ciudad;
import com.near.springbootapplication.entity.Empresa;
import com.near.springbootapplication.service.CiudadService;
import com.near.springbootapplication.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;


    @GetMapping("/empresa")
    public ResponseEntity<?> obtenerTodasEmpresas() {
        try {
            List<Empresa> empresas = empresaService.obtenerEmpresas();
            return ResponseEntity.ok(empresas);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al obtener las ciudades: " + e.getMessage());
        }
    }
}
