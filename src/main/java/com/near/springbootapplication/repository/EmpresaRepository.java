package com.near.springbootapplication.repository;

import com.near.springbootapplication.entity.Ciudad;
import com.near.springbootapplication.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {

    List<Empresa> findAll();
}