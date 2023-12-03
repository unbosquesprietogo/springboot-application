package com.near.springbootapplication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_EMPRESA")
    private int idEmpresa;

    @Column(nullable = false, name = "RAZON_SOCIAL")
    private String razonSocial;

    @Column(nullable = false, name = "NIT_EMPRESA")
    private String nitEmpresa;

    @Column(nullable = false, name = "DIR_EMPRESA")
    private String dirEmpresa;

    @Column(nullable = false, name = "CORREO_EMPRESA")
    private String correoEmpresa;

    @Column(nullable = false, name = "REPRESENTANTE")
    private String representante;

    @Column(nullable = false, name = "TELEFONO_EMPRESA")
    private String telefonoEmpresa;

}