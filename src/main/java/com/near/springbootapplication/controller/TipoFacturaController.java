package com.near.springbootapplication.controller;

import com.near.springbootapplication.entity.Categoria;
import com.near.springbootapplication.entity.TipoFactura;
import com.near.springbootapplication.service.CategoriaService;
import com.near.springbootapplication.service.TipoFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TipoFacturaController {

    @Autowired
    private TipoFacturaService tipoFacturaService;

    @GetMapping("/tipo-factura")
    public ResponseEntity<?> getAllTiposFacturas() {
        try {
            List<TipoFactura> tiposFacturas = tipoFacturaService.getTipoFactura();
            return ResponseEntity.ok(tiposFacturas);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al obtener tipos de factura: " + e.getMessage());
        }
    }
}
