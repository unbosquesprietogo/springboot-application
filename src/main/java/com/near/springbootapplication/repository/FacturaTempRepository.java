package com.near.springbootapplication.repository;

import com.near.springbootapplication.entity.Factura;
import com.near.springbootapplication.entity.FacturaTemp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FacturaTempRepository extends JpaRepository<FacturaTemp, Integer> {

    FacturaTemp save(FacturaTemp facturaTemp);





}
