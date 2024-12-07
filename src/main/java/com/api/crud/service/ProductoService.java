package com.api.crud.service;
import com.api.crud.models.ProductoModel;
import com.api.crud.repositories.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    IProductoRepository productoRepository;

    public List<ProductoModel> getProductos() {
        return productoRepository.findActiveProducts();
    }
    public ProductoModel updateById(ProductoModel request, Long id) {

        Optional<ProductoModel> optionalProduct = productoRepository.findById(id);
        if (optionalProduct.isEmpty()) {
            throw new RuntimeException("Producto no encontrado con el ID: " + id);
        }
        productoRepository.modificarPrecioProducto(id, request.getPrecioVenta());
        ProductoModel updatedProduct = optionalProduct.get();
        updatedProduct.setPrecioVenta(request.getPrecioVenta());
        return updatedProduct;
    }
}
