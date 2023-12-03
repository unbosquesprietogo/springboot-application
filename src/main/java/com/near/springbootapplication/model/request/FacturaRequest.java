package com.near.springbootapplication.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.near.springbootapplication.entity.Cliente;
import com.near.springbootapplication.entity.DetalleFactura;
import com.near.springbootapplication.entity.Factura;
import com.near.springbootapplication.entity.TipoFactura;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FacturaRequest {


    private Factura factura;
    private List<DetalleFactura> detallesFactura;

}