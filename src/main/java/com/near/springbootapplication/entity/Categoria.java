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
@Table(name = "CATEGORIA")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CATEGORIA")
    private int idCategoria;

    @Column(name = "NOM_CATEGORIA", nullable = false, length = 35)
    private String nombreCategoria;

    @Column(name = "ESTADO_CATEGORIA", length = 1)
    private String estadoCategoria;

    // Constructores, getters y setters generados por Lombok
}

