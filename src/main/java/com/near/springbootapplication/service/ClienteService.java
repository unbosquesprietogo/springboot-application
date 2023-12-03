package com.near.springbootapplication.service;

import com.near.springbootapplication.entity.Cliente;
import com.near.springbootapplication.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    // Crear Cliente
    public Cliente crearCliente(Cliente cliente) {

        // Puedes agregar validaciones o lógica de negocio aquí antes de guardar
        return clienteRepository.save(cliente);
    }

    // Modificar Cliente
    public Cliente modificarCliente(Cliente cliente) {
        // Verifica si el cliente existe antes de modificar
        if (clienteRepository.existsById(cliente.getIdCliente())) {
            return clienteRepository.save(cliente);
        } else {
            // Manejar el caso cuando el cliente no existe
            throw new IllegalArgumentException("Cliente no encontrado");
        }
    }

    // Eliminar Cliente
    public void eliminarCliente(int idCliente) {
        clienteRepository.deleteById(idCliente);
    }

    // Consultar Cliente por ID
    public Optional<Cliente> consultarClientePorId(int idCliente) {
        return clienteRepository.findById(idCliente);
    }

    // Consultar todos los Clientes
    public List<Cliente> consultarTodosLosClientes() {
        return clienteRepository.findAll();
    }

    // Otros métodos del servicio...

    // Añadir Cliente (o Modificar si ya existe)
    public Cliente añadirOActualizarCliente(Cliente cliente) {
        // Verifica si el cliente existe antes de añadir o actualizar
        Optional<Cliente> clienteExistente = clienteRepository.findById(cliente.getIdCliente());
        if (clienteExistente.isPresent()) {
            // Actualiza el cliente existente
            Cliente clienteActualizado = clienteExistente.get();
            // Ajusta los campos que deseas permitir actualizar
            clienteActualizado.setNombreCliente(cliente.getNombreCliente());
            clienteActualizado.setApellidoCliente(cliente.getApellidoCliente());
            // Actualiza otros campos si es necesario
            return clienteRepository.save(clienteActualizado);
        } else {
            // Añade un nuevo cliente si no existe
            return clienteRepository.save(cliente);
        }
    }

    public Cliente consultarClientePorNit(String nitCliente) {
        return clienteRepository.findByNitCliente(nitCliente);
    }
}

