package com.near.springbootapplication.service;


import com.near.springbootapplication.entity.TipoCliente;
import com.near.springbootapplication.repository.TipoClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoClienteService {

    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    public List<TipoCliente> getTipoCliente() {
        return tipoClienteRepository.findAll();
    }




}
