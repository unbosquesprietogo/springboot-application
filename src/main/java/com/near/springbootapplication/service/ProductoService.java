package com.near.springbootapplication.service;

import com.near.springbootapplication.entity.Producto;
import com.near.springbootapplication.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    // Consultar Productos por ID de Categoría
    public List<Producto> consultarProductosPorCategoria(int idCategoria) {
        return productoRepository.findByCategoria_IdCategoria(idCategoria);
    }

    // Otros métodos del servicio...
}
