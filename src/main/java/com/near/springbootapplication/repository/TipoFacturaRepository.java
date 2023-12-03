package com.near.springbootapplication.repository;

import com.near.springbootapplication.entity.TipoFactura;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TipoFacturaRepository extends JpaRepository<TipoFactura, Integer> {

    List<TipoFactura> findAll();
}
