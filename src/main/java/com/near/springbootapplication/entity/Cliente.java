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
@Table(name = "CLIENTE")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private int idCliente;

    @Column(name = "ID_EMPRESA", nullable = false)
    private int idEmpresa;

    @Column(name = "NIT_CLIENTE", nullable = false, length = 15)
    private String nitCliente;

    @Column(name = "RSOCIAL_CLIENTE", nullable = false, length = 70)
    private String razonSocialCliente;

    @ManyToOne
    @JoinColumn(name = "ID_TIPO_CLIENTE", nullable = false)
    private TipoCliente tipoCliente;

    @Column(name = "NOMBRE_CLIENTE", nullable = false, length = 75)
    private String nombreCliente;

    @Column(name = "APELLIDO_CLIENTE", nullable = false, length = 75)
    private String apellidoCliente;

    @Column(name = "DIR_CLIENTE", nullable = false, length = 85)
    private String direccionCliente;

    @ManyToOne
    @JoinColumn(name = "ID_CIUDAD", nullable = false)
    private Ciudad ciudad;

    @Column(name = "CORREO_CLIENTE", length = 85)
    private String correoCliente;

    @Column(name = "TEL_CLIENTE", nullable = false, length = 30)
    private String telefonoCliente;

    @Column(name = "CODPOSTAL_CLIENTE", length = 15)
    private String codigoPostalCliente;

    @Column(name = "CUPOCREDITO_CLIENTE", nullable = false, columnDefinition = "INT DEFAULT 0")
    private int cupoCreditoCliente;

    @Column(name = "SALDO_CLIENTE", nullable = false, columnDefinition = "INT DEFAULT 0")
    private int saldoCliente;

    @Column(name = "COMPRASMES_CLIENTE", nullable = false, columnDefinition = "INT DEFAULT 0")
    private int comprasMesCliente;

    @Column(name = "PAGOSMES_CLIENTE", nullable = false, columnDefinition = "INT DEFAULT 0")
    private int pagosMesCliente;

    @Column(name = "ESTADO_CLIENTE", nullable = false, length = 1)
    private String estadoCliente;

}

