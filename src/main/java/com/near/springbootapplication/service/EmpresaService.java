package com.near.springbootapplication.service;

import com.near.springbootapplication.entity.Ciudad;
import com.near.springbootapplication.entity.Empresa;
import com.near.springbootapplication.repository.CiudadRepository;
import com.near.springbootapplication.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;


    public List<Empresa> obtenerEmpresas() {
        return empresaRepository.findAll();
    }
}