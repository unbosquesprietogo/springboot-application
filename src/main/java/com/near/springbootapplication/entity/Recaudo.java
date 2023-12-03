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
@Table(name = "RECAUDO")
public class Recaudo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_RECAUDO")
    private int idRecaudo;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE_RECAUDO", nullable = false)
    private Cliente clienteRecaudo;

    @ManyToOne
    @JoinColumn(name = "ID_FACTURA_RECAUDO", nullable = false)
    private Factura facturaRecaudo;

    @Column(name = "VALOR_RECAUDO", nullable = false, columnDefinition = "INT DEFAULT 0")
    private int valorRecaudo;

    @Column(name = "FECHA_RECAUDO")
    @Temporal(TemporalType.DATE)
    private Date fechaRecaudo;

    // Constructores, getters y setters generados por Lombok
}

