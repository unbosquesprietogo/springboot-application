package com.near.springbootapplication.repository;


import com.near.springbootapplication.entity.ParametroGeneral;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ParametroGeneralRepository extends JpaRepository<ParametroGeneral, Integer> {

    Optional<ParametroGeneral> findById(int idParametro);
}
