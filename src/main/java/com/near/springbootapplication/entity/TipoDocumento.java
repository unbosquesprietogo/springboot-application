package com.near.springbootapplication.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import jakarta.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TIPO_DOCUMENTO")
public class TipoDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DOCUMENTO")
    private int idDocumento;

    @Column(nullable = false, name = "NOMBRE_DOCUMENTO")
    private String nombreDocumento;
}
