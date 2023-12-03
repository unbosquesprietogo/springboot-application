package com.near.springbootapplication.repository;

import com.near.springbootapplication.entity.Permisos;
import com.near.springbootapplication.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {
    List<Role> findByPermisos_Roles_RoleName(String roleName);





}
