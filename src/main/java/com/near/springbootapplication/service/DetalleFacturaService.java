package com.near.springbootapplication.service;

import com.near.springbootapplication.entity.DetalleFactura;
import com.near.springbootapplication.repository.DetalleFacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleFacturaService {

    @Autowired
    private DetalleFacturaRepository detalleFacturaRepository;


    public List<DetalleFactura> saveDetallesFactura(List<DetalleFactura> detallesFactura) {
        return detalleFacturaRepository.saveAll(detallesFactura);
    }

}
