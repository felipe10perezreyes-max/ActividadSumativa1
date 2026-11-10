package com.actividad.model;

/**
 * Representa la categoría a la que pertenece un producto.
 */
public class Categoria {
    private String nombre;
    private String codigo;

    public Categoria(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Categoría: " + nombre + " (Código: " + codigo + ")";
    }
}
