package com.near.springbootapplication.repository;

import com.near.springbootapplication.entity.TipoCliente;
import com.near.springbootapplication.entity.TipoFactura;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TipoClienteRepository extends JpaRepository<TipoCliente, Integer> {

    List<TipoCliente> findAll();
}
