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
@Table(name = "FACTURA")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FACTURA")
    private int idFactura;

    @Column(name = "FECHA_FACTURA", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaFactura;

    @ManyToOne
    @JoinColumn(name = "ID_TIPOFAC", nullable = false)
    private TipoFactura tipoFactura;

    @ManyToOne
    @JoinColumn(name = "CLIENTE_FACTURA", nullable = false)
    private Cliente clienteFactura;

    @Column(name = "TOTAL_FACTURA", nullable = false, columnDefinition = "FLOAT DEFAULT 0")
    private float totalFactura;

    @Column(name = "DESCUENTO_FACTURA", nullable = false, columnDefinition = "FLOAT DEFAULT 0")
    private float descuentoFactura;

    @Column(name = "IVA_FACTURA", nullable = false, columnDefinition = "FLOAT DEFAULT 0")
    private float ivaFactura;

    @Column(name = "SUBTOTAL_FACTURA", nullable = false, columnDefinition = "FLOAT DEFAULT 0")
    private float subtotalFactura;

    @Column(name = "SALDO_FACTURA", nullable = false, columnDefinition = "FLOAT DEFAULT 0")
    private float saldoFactura;

    @Column(name = "ESTADO_FACTURA", nullable = false, length = 1)
    private String estadoFactura;

    // Constructores, getters y setters generados por Lombok
}

