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
@Table(name = "CIUDAD")
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CIUDAD")
    private int idCiudad;

    @Column(nullable = false, name = "COD_CIUDAD")
    private String codigoCiudad;

    @Column(nullable = false, name = "NOMBRE_CIUDAD")
    private String nombreCiudad;

    @Column(nullable = false, name = "ESTADO_CIUDAD", length = 1)
    private String estadoCiudad;

    @ManyToOne
    @JoinColumn(name = "ID_DPTO_CIUDAD", nullable = false)
    private Departamento departamento;
}
