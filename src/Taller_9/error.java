/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller_9;

/**
 *
 * @author Sebastian
 */
public class error {
    private String tipo;
    public error(String tipo) {
        this.tipo = tipo;
    }
}

public class Main {
    public static void main(String[] args) {
        // Error: No se puede usar `super` aquí porque Main no es una clase derivada 
        super.tipo = "Orquídea"; // Error de compilación
    }
}

