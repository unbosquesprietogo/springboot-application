package com.near.springbootapplication.controller;

import com.near.springbootapplication.entity.Cliente;
import com.near.springbootapplication.entity.Factura;
import com.near.springbootapplication.model.request.FacturaRequest;
import com.near.springbootapplication.service.ClienteService;
import com.near.springbootapplication.service.FacturaService;
import com.near.springbootapplication.service.FacturaTempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/factura")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;
    @Autowired
    private FacturaTempService facturaTempService;




    @PostMapping
    public ResponseEntity<?> crearFactura(@RequestBody FacturaRequest facturaRequest) {
        try {
            Factura factura = facturaService.crearFacturaConDetalles(facturaRequest.getFactura(),
                    facturaRequest.getDetallesFactura());
            return ResponseEntity.status(HttpStatus.CREATED).body(factura);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al crear la factura: " + e.getMessage());
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<Factura> obtenerFacturaPorId(@PathVariable int id) {
        Optional<Factura> factura = facturaService.getFacturaById(id);

        return factura.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/carga")
    public ResponseEntity<?> enviarFacturas() {
        try {
            List<Factura> factura = facturaTempService.obtenerFacturasTemporalesYEliminar();
            return ResponseEntity.status(HttpStatus.OK).body(factura);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al enviar las facturas: " + e.getMessage());
        }
    }
}
