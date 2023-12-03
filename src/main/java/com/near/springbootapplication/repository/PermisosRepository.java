package com.near.springbootapplication.repository;

import com.near.springbootapplication.entity.Permisos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PermisosRepository extends JpaRepository<Permisos,Integer> {
    List<Permisos> findByRoles_RoleName(String roleName);


}
