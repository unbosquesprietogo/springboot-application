package com.near.springbootapplication.controller;

import com.near.springbootapplication.entity.TipoCliente;
import com.near.springbootapplication.service.TipoClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TipoClienteController {

    @Autowired
    private TipoClienteService tipoClienteService;

    @GetMapping("/tipo-cliente")
    public ResponseEntity<?> getAllTipoClientes() {
        try {
            List<TipoCliente> tipoClientes = tipoClienteService.getTipoCliente();
            return ResponseEntity.ok(tipoClientes);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al obtener tipos de cliente: " + e.getMessage());
        }
    }
}
