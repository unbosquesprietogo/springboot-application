package com.near.springbootapplication.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MOVPRODUCTO")
public class MovimientoProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MOV")
    private int idMovimiento;

    @ManyToOne
    @JoinColumn(name = "ID_TIPOMOV", nullable = false)
    private TipoMovimiento tipoMovimiento;

    @Column(name = "CANTIDAD_MOV", nullable = false, columnDefinition = "INT DEFAULT 0")
    private int cantidadMovimiento;

    @ManyToOne
    @JoinColumn(name = "ID_PRODUCTO", nullable = false)
    private Producto producto;

    @Column(name = "FECHA_MOVIMIENTO", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaMovimiento;

    @Column(name = "ESTADO_MOVIMIENTO", nullable = false, length = 1)
    private String estadoMovimiento;

}

