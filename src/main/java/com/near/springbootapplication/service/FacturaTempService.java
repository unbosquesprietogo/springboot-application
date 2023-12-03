package com.near.springbootapplication.service;

import com.near.springbootapplication.entity.Factura;
import com.near.springbootapplication.entity.FacturaTemp;
import com.near.springbootapplication.entity.Role;
import com.near.springbootapplication.entity.Usuario;
import com.near.springbootapplication.model.request.RegisterRequest;
import com.near.springbootapplication.model.response.AuthResponse;
import com.near.springbootapplication.repository.FacturaTempRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FacturaTempService {

    private final FacturaTempRepository facturaTempRepository;

    @Autowired
    public FacturaTempService(FacturaTempRepository facturaTempRepository) {
        this.facturaTempRepository = facturaTempRepository;
    }

    public FacturaTemp facturaTemp(Factura factura) {


         FacturaTemp facturaTemp = FacturaTemp.builder()
                .estado(true)
                .factura(factura)
                .build();

        return facturaTempRepository.save(facturaTemp);

    }

    public List<Factura> obtenerFacturasTemporalesYEliminar() {
        List<FacturaTemp> facturasTemporales = facturaTempRepository.findAll();

        // Obtener las facturas asociadas a las facturas temporales
        List<Factura> facturas = facturasTemporales.stream()
                .map(FacturaTemp::getFactura)
                .collect(Collectors.toList());

        // Eliminar las facturas temporales
        facturaTempRepository.deleteAll(facturasTemporales);

        return facturas;
    }

    public void truncateFacturaTempTable() {
        facturaTempRepository.deleteAllInBatch();
    }



}
