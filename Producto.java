package com.actividad.model;

/**
 * Representa un producto del sistema.
 * Utiliza composición al incluir un objeto de tipo Categoria.
 */
public class Producto {
    private String nombre;
    private double precio;
    private Categoria categoria; // Composición entre objetos

    public Producto(String nombre, double precio, Categoria categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + " | Precio: $" + precio + " | " + categoria.toString();
    }
}
