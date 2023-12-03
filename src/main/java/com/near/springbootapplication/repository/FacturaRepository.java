package com.near.springbootapplication.repository;

import com.near.springbootapplication.entity.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface FacturaRepository extends JpaRepository<Factura, Integer> {

    // Método para obtener todas las facturas
    List<Factura> findAll();

    // Método para obtener una factura por su ID
    Optional<Factura> findById(int idFactura);

    // Método para guardar una nueva factura
    Factura save(Factura factura);

    // Método para eliminar una factura por su ID
    void deleteById(int idFactura);

    @Query("SELECT SUM(f.ivaFactura) FROM Factura f WHERE f.idFactura = :idFactura")
    Optional<Float> consultarImpuestos(int idFactura);
}
