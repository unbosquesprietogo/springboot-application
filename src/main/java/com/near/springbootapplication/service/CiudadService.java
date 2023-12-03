package com.near.springbootapplication.service;

import com.near.springbootapplication.entity.Ciudad;
import com.near.springbootapplication.repository.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CiudadService {

    private final CiudadRepository ciudadRepository;

    @Autowired
    public CiudadService(CiudadRepository ciudadRepository) {
        this.ciudadRepository = ciudadRepository;
    }

    public List<Ciudad> obtenerCiudades() {
        return ciudadRepository.findAll();
    }
}