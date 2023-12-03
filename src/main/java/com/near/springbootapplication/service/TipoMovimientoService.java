package com.near.springbootapplication.service;

import com.near.springbootapplication.entity.TipoMovimiento;
import com.near.springbootapplication.repository.TipoMovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoMovimientoService {

    private final TipoMovimientoRepository tipoMovimientoRepository;

    @Autowired
    public TipoMovimientoService(TipoMovimientoRepository tipoMovimientoRepository) {
        this.tipoMovimientoRepository = tipoMovimientoRepository;
    }

    public void insertarTiposMovimientoIniciales() {
        insertarTipoMovimiento(1, "Actualización de precios", "A");
        insertarTipoMovimiento(2, "Ingreso por Compras", "A");
        insertarTipoMovimiento(3, "Entrada por Ajuste", "A");
        insertarTipoMovimiento(4, "Salida por Ajuste", "A");
        insertarTipoMovimiento(5, "Ventas Crédito", "A");
        insertarTipoMovimiento(6, "Ventas Contado", "A");
        insertarTipoMovimiento(7, "Ingreso a Bodega", "A");
        insertarTipoMovimiento(8, "Salida de Bodega", "A");
    }

    private void insertarTipoMovimiento(int id, String nombre, String estado) {
        TipoMovimiento tipoMovimiento = TipoMovimiento.builder()
                .idTipoMovimiento(id)
                .nombreTipoMovimiento(nombre)
                .estadoTipoMovimiento(estado)
                .build();

        tipoMovimientoRepository.save(tipoMovimiento);
    }
}

