package com.near.springbootapplication.repository;

import com.near.springbootapplication.entity.Empresa;
import com.near.springbootapplication.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

    List<Producto> findAll();

    List<Producto> findByCategoria_IdCategoria(int idCategoria);
}