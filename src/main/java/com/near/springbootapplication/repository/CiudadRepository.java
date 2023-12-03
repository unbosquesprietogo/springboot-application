package com.near.springbootapplication.repository;

import com.near.springbootapplication.entity.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CiudadRepository extends JpaRepository<Ciudad, Integer> {

    List<Ciudad> findAll();
}