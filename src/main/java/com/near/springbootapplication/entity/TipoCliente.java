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
@Table(name = "TIPO_CLIENTE")
public class TipoCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TIPO_CLIENTE")
    private int idTipoCliente;

    @Column(nullable = false, name = "DESCRIPCION_TCLIENTE")
    private String descripcionTipoCliente;

    @Column(nullable = false, name = "ESTADO_TCLIENTE", length = 1)
    private String estadoTipoCliente;

}

