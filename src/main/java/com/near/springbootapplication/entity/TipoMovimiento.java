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
@Table(name = "TIPOMOV")
public class TipoMovimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TIPOMOV")
    private int idTipoMovimiento;

    @Column(name = "NOM_TIPOMOV", nullable = false, length = 45)
    private String nombreTipoMovimiento;

    @Column(name = "ESTADO_TIPOMOV", length = 1)
    private String estadoTipoMovimiento;

    // Constructores, getters y setters generados por Lombok
}
