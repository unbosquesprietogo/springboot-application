package com.near.springbootapplication.service;


import com.near.springbootapplication.entity.Categoria;
import com.near.springbootapplication.entity.TipoFactura;
import com.near.springbootapplication.repository.CategoriaRepository;
import com.near.springbootapplication.repository.TipoFacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoFacturaService {

    @Autowired
    private TipoFacturaRepository tipoFacturaRepository;

    public List<TipoFactura> getTipoFactura() {
        return tipoFacturaRepository.findAll();
    }




}
