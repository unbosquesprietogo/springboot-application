package com.near.springbootapplication.controller;

import com.near.springbootapplication.entity.Categoria;
import com.near.springbootapplication.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/categoria")
    public ResponseEntity<?> getAllCategorias() {
        try {
            List<Categoria> categorias = categoriaService.getAlCategorias();
            return ResponseEntity.ok(categorias);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al obtener las categorías: " + e.getMessage());
        }
    }
}
