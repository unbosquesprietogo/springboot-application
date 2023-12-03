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
@Table(name = "TIPOFACTURA")
public class TipoFactura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TIPOFAC")
    private int idTipoFactura;

    @Column(name = "NOM_TIPOFAC", nullable = false, length = 45)
    private String nombreTipoFactura;

    @Column(name = "ESTADO_TIPOFAC", nullable = false, length = 1)
    private String estadoTipoFactura;

    // Constructores, getters y setters generados por Lombok
}

