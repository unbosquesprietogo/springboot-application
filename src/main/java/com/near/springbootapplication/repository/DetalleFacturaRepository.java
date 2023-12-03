package com.near.springbootapplication.repository;

import com.near.springbootapplication.entity.Cliente;
import com.near.springbootapplication.entity.DetalleFactura;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DetalleFacturaRepository extends JpaRepository<DetalleFactura, Integer> {

}
