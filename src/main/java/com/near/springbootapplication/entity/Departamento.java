package com.near.springbootapplication.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DEPARTAMENTO")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DPTO")
    private int idDepartamento;

    @Column(nullable = false, name = "NOMBRE_DPTO")
    private String nombreDepartamento;

    @Column(nullable = false, name = "ESTADO_DPTO", length = 1)
    private String estadoDepartamento;

    @ManyToOne
    @JoinColumn(name = "ID_PAIS_DPTO", nullable = false)
    private Pais pais;
}