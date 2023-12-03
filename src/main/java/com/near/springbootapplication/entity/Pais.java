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
@Table(name = "PAIS")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PAIS")
    private int idPais;

    @Column(nullable = false, name = "NOMBRE_PAIS")
    private String nombrePais;

    @Column(name = "ESTADO_PAIS", length = 1)
    private String estadoPais;


}
