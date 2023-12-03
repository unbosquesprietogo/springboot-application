package com.near.springbootapplication.repository;

import com.near.springbootapplication.entity.Categoria;
import com.near.springbootapplication.entity.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

    List<Categoria> findAll();

}
