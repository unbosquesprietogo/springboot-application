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
@Table(name = "PARAMETRO_GENERAL")
public class ParametroGeneral {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PARAMETRO_GENERAL")
    private int idParametroGeneral;

    @Column(name = "NOMBRE_PARAMETRO", nullable = false, length = 10)
    private String nombreParametro;

    @Column(name = "DESCRIPCION_PARAMETRO", nullable = false, length = 60)
    private String descripcionParametro;

    @Column(name = "VALOR_PARAMETRO", nullable = false, length = 100)
    private String valorParametro;

    @Column(name = "TIPO_PARAMETRO", nullable = false, length = 1)
    private String tipoParametro;

    // Constructores, getters y setters generados por Lombok
}

