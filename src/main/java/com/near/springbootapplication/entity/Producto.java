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
@Table(name = "PRODUCTO")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRODUCTO")
    private int idProducto;

    @ManyToOne
    @JoinColumn(name = "ID_CATEGORIA", nullable = false)
    private Categoria categoria;

    @Column(name = "COD_PRODUCTO", nullable = false, length = 12)
    private String codigoProducto;

    @Column(name = "DES_PRODUCTO", nullable = false, length = 60)
    private String descripcionProducto;

    @Column(name = "EXIS_PRODUCTO", nullable = false, columnDefinition = "INT DEFAULT 0")
    private int existenciaProducto;

    @Column(name = "BODEGA_PRODUCTO", nullable = false, columnDefinition = "INT DEFAULT 0")
    private int bodegaProducto;

    @Column(name = "PRECIO_VENTA_ACT", nullable = false, columnDefinition = "FLOAT DEFAULT 0")
    private float precioVentaActual;

    @Column(name = "PRECIO_VENTA_ANT", nullable = false, columnDefinition = "FLOAT DEFAULT 0")
    private float precioVentaAnterior;

    @Column(name = "DSCTO_MINIMO", nullable = false, columnDefinition = "INT DEFAULT 0")
    private int descuentoMinimo;

    @Column(name = "DSCTO_MAXIMO", nullable = false, columnDefinition = "INT DEFAULT 0")
    private int descuentoMaximo;

    @Column(name = "COSTO_VENTA", nullable = false, columnDefinition = "FLOAT DEFAULT 0")
    private float costoVenta;

    @Column(name = "MARGEN_UTILIDAD", nullable = false, columnDefinition = "FLOAT DEFAULT 0")
    private float margenUtilidad;

    @Column(name = "VALOR_IVA", nullable = false, columnDefinition = "FLOAT DEFAULT 0")
    private float valorIVA;

    @Column(name = "STOCK_MINIMO", nullable = false, columnDefinition = "INT DEFAULT 0")
    private int stockMinimo;

    @Column(name = "STOCK_MAXIMO", nullable = false, columnDefinition = "INT DEFAULT 0")
    private int stockMaximo;

    @Column(name = "ESTADO_PRODUCTO", nullable = false, length = 1)
    private String estadoProducto;

    // Constructores, getters y setters generados por Lombok
}
