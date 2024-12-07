package com.api.crud.repositories;


import com.api.crud.models.ProductoModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductoRepository extends JpaRepository<ProductoModel, Long> {

    @Query(value = "CALL modificar_precio_producto(:idProducto, :nuevoPrecio)", nativeQuery = true)
    void modificarPrecioProducto(@Param("idProducto") Long idProducto, @Param("nuevoPrecio") Double nuevoPrecio);

    @Query("SELECT p FROM ProductoModel p WHERE p.estatus = 1")
    List<ProductoModel> findActiveProducts();

}

