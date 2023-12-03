package com.near.springbootapplication.controller;

import com.near.springbootapplication.entity.Cliente;
import com.near.springbootapplication.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/cliente/{nitCliente}")
    public ResponseEntity<?> obtenerClientePorNit(@PathVariable String nitCliente) {
        try {
            Cliente cliente = clienteService.consultarClientePorNit(nitCliente);
            return ResponseEntity.status(HttpStatus.OK).body(cliente);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al crear el cliente: " + e.getMessage());
        }
    }
    @PostMapping("cliente")
    public ResponseEntity<?> crearCliente(@RequestBody Cliente cliente) {
        try {
            Cliente nuevoCliente = clienteService.crearCliente(cliente);
            return ResponseEntity.status(HttpStatus.CREATED).body(nuevoCliente);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al crear el cliente: " + e.getMessage());
        }
    }
}
