package com.near.springbootapplication.controller;

import com.near.springbootapplication.entity.Cliente;
import com.near.springbootapplication.entity.Factura;
import com.near.springbootapplication.model.request.FacturaRequest;
import com.near.springbootapplication.service.ClienteService;
import com.near.springbootapplication.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
@RequestMapping("/api/v1")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @PostMapping("/factura")
    public ResponseEntity<?> crearCliente(@RequestBody FacturaRequest facturaRequest) {
        try {
            Factura factura = facturaService.crearFacturaConDetalles(facturaRequest.getFactura(),
                    facturaRequest.getDetallesFactura());
            return ResponseEntity.status(HttpStatus.CREATED).body(factura);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al crear el cliente: " + e.getMessage());
        }
    }
}
