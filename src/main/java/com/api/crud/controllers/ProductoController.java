package com.api.crud.controllers;

import com.api.crud.models.ProductoModel;
import com.api.crud.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    // Obtener todos los productos
    @GetMapping("/getall")
    public ResponseEntity<List<ProductoModel>> getProductosActivos() {
        List<ProductoModel> productosActivos = productoService.getProductos();
        if (productosActivos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(productosActivos);
    }

    // Editar un producto
    @PutMapping(path = "/edit/{id}")
    public ProductoModel updateProductoById(
            @RequestBody ProductoModel request,
            @PathVariable("id") Long id) {

        return this.productoService.updateById(request, id);
    }
}
