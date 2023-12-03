package com.near.springbootapplication.repository;

import com.near.springbootapplication.entity.Cliente;
import com.near.springbootapplication.entity.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    List<Cliente> findAll();

    // Método para obtener una factura por su ID
    Optional<Cliente> findById(int idCliente);

    // Método para guardar una nueva factura
    Cliente save(Cliente cliente);

    // Método para eliminar una factura por su ID
    void deleteById(int idFactura);

    Cliente findByNitCliente(String nitCliente);
}

