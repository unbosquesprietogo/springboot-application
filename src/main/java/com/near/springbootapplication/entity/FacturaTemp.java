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
@Table(name = "FACTURA-TEMP")
public class FacturaTemp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FACTURA_TEMP")
    private int idFacturaTemp;

    @ManyToOne
    @JoinColumn(name = "ID_FACTURA", nullable = false)
    private Factura factura;
    private boolean estado;

}
