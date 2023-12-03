package com.near.springbootapplication.controller;

import com.near.springbootapplication.entity.Producto;
import com.near.springbootapplication.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/producto")
public class ProductoController {

    private final ProductoService productoService;

    @Autowired
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }


    @GetMapping
    public ResponseEntity<?> getProductos() {
        try {
            List<Producto> productos = productoService.getProductos();
            return ResponseEntity.ok(productos);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al obtener los productos: " + e.getMessage());
        }
    }
    @PostMapping("/categoria/{idCategoria}")
    public ResponseEntity<?> getProductosPorCategoria(@PathVariable int idCategoria) {
        try {
            List<Producto> productos = productoService.consultarProductosPorCategoria(idCategoria);
            return ResponseEntity.ok(productos);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al obtener los productos por categoría: " + e.getMessage());
        }
    }

}
