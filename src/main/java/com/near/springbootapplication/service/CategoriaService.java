package com.near.springbootapplication.service;


import com.near.springbootapplication.entity.Categoria;
import com.near.springbootapplication.entity.Factura;
import com.near.springbootapplication.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;


    public List<Categoria> getAlCategorias() {
        return categoriaRepository.findAll();
    }




}
