
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
@Table(name = "DETALLEFACTURA")
public class DetalleFactura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DETALLE_FACTURA")
    private int idDetalleFactura;

    @ManyToOne
    @JoinColumn(name = "ID_FACTURA", nullable = false)
    private Factura factura;

    @ManyToOne
    @JoinColumn(name = "ID_PRODUCTO", nullable = false)
    private Producto producto;

    @Column(name = "CANT_VENDIDA", nullable = false, columnDefinition = "INT DEFAULT 0")
    private int cantidadVendida;

    @Column(name = "PRECIO_VENTA", nullable = false, columnDefinition = "FLOAT DEFAULT 0")
    private float precioVenta;

    @Column(name = "VALOR_IVA", nullable = false, columnDefinition = "FLOAT DEFAULT 0")
    private float valorIVA;

    @Column(name = "DESCTO_DETFAC", nullable = false, columnDefinition = "FLOAT DEFAULT 0")
    private float descuentoDetalleFactura;

}

