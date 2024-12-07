package com.api.crud.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "productos")
public class ProductoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "categoria", nullable = false)
    private String categoria;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precio_venta", nullable = false)
    private Double precioVenta;

    @Column(name = "peso_cantidad")
    private String pesoCantidad;

    @Column(name = "stock_actual")
    private Integer stockActual;

    @Column(name = "stock_minimo")
    private Integer stockMinimo;

    @Column(name = "fecha_caducidad")
    private Date fechaCaducidad;

    @Column(name = "fecha_registro", updatable = false, insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;

    @Column(name = "estatus")
    private Integer estatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Double getPrecioVenta() {
        return precioVenta;
    }
    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }
    public String getPesoCantidad() {
        return pesoCantidad;
    }
    public void setPesoCantidad(String pesoCantidad) {
        this.pesoCantidad = pesoCantidad;
    }
    public Integer getStockActual() {
        return stockActual;
    }
    public void setStockActual(Integer stockActual) {
        this.stockActual = stockActual;
    }
    public Integer getStockMinimo() {
        return stockMinimo;
    }
    public void setStockMinimo(Integer stockMinimo) {
        this.stockMinimo = stockMinimo;
    }
    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }
    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    public Date getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public Integer getEstatus() {
        return estatus;
    }
    public void setEstatus(Integer estatus) {
        this.estatus = estatus;
    }
}
