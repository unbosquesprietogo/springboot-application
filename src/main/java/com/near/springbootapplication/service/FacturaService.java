package com.near.springbootapplication.service;

import com.near.springbootapplication.entity.Cliente;
import com.near.springbootapplication.entity.DetalleFactura;
import com.near.springbootapplication.entity.Factura;
import com.near.springbootapplication.repository.ClienteRepository;
import com.near.springbootapplication.repository.DetalleFacturaRepository;
import com.near.springbootapplication.repository.FacturaRepository;
import com.near.springbootapplication.repository.ParametroGeneralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ParametroGeneralRepository parametroGeneralRepository;
    @Autowired
    private DetalleFacturaRepository detalleFacturaRepository;


    @Transactional
    public Factura crearFacturaConDetalles(Factura factura, List<DetalleFactura> detalles) {

        float iva = Float.valueOf(
                parametroGeneralRepository.findById(1)
                        .get().getValorParametro());

        factura.setIvaFactura(iva);

        Factura facturaGuardada = facturaRepository.save(factura);

        detalles.forEach(detalle -> detalle.setFactura(facturaGuardada));
        detalles.forEach(detalle -> detalle.setValorIVA(iva));
        detalleFacturaRepository.saveAll(detalles);

        return facturaGuardada;
    }
    public List<Factura> getAllFacturas() {
        return facturaRepository.findAll();
    }

    public Optional<Factura> getFacturaById(int idFactura) {
        return facturaRepository.findById(idFactura);
    }

    public Factura createFactura(Factura factura) {

        // Puedes realizar validaciones o lógica adicional antes de guardar la factura
        return facturaRepository.save(factura);
    }

    public Factura updateFactura(int idFactura, Factura factura) {
        // Verifica si la factura con el ID proporcionado existe
        if (facturaRepository.existsById(idFactura)) {
            // Actualiza los campos de la factura existente
            factura.setIdFactura(idFactura);
            return facturaRepository.save(factura);
        } else {
            // Manejo de error o lanzar una excepción si la factura no existe
            // ...
            return null;
        }
    }

    public void deleteFactura(int idFactura) {
        // Verifica si la factura con el ID proporcionado existe antes de eliminar
        if (facturaRepository.existsById(idFactura)) {
            facturaRepository.deleteById(idFactura);
        } else {
            // Manejo de error o lanzar una excepción si la factura no existe
            // ...
        }
    }

    // Consultar Impuestos
    public Float consultarImpuestos(int idFactura) {
        Optional<Float> impuestos = facturaRepository.consultarImpuestos(idFactura);
        return impuestos.orElse(0.0f);
    }

    public void modificarClienteEnFactura(int idFactura, int nuevoIdCliente) {
        Optional<Factura> facturaOptional = facturaRepository.findById(idFactura);
        Optional<Cliente> nuevoClienteOptional = clienteRepository.findById(nuevoIdCliente);

        if (facturaOptional.isPresent()) {
            Factura factura = facturaOptional.get();

            if (nuevoClienteOptional.isPresent()) {
                // Si el nuevo cliente existe, simplemente modifica el cliente en la factura
                Cliente nuevoCliente = nuevoClienteOptional.get();
                factura.setClienteFactura(nuevoCliente);
            } else {
                // Si el nuevo cliente no existe, créalo y luego asígnalo a la factura
                Cliente nuevoCliente = new Cliente();
                nuevoCliente.setIdCliente(nuevoIdCliente); // Ajusta según tu lógica de generación de ID
                // Configura otros atributos del cliente según tus necesidades
                clienteRepository.save(nuevoCliente);

                factura.setClienteFactura(nuevoCliente);
            }

            // Guarda la factura modificada
            facturaRepository.save(factura);
        } else {
            // Manejar el caso cuando la factura no existe
            throw new IllegalArgumentException("Factura no encontrada");
        }
    }


}

