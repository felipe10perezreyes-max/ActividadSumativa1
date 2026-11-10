package com.actividad.app;

import com.actividad.model.Categoria;
import com.actividad.model.Producto;

public class Main {
    public static void main(String[] args) {
        // Instanciación de la categoría
        Categoria catElectroni = new Categoria("Electrónica", "CAT-001");

        // Instanciación del producto aplicando composición
        Producto prod1 = new Producto("Teclado Mecánico", 45000, catElectroni);

        // Impresión en consola usando toString()
        System.out.println("=== SISTEMA DE GESTIÓN DE PRODUCTOS ===");
        System.out.println(prod1.toString());
    }
}
