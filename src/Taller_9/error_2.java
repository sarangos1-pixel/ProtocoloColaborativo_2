/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller_9;

/**
 *
 * @author Sebastian
 */
public class error_2 {
    private String nombre;
    public error_2(String nombre) {
        this.nombre = nombre;
    }
}

 class persona extends error_2 {
    public persona(String nombre) {
        super(nombre);
    }

    public void mostrarNombre() {
        // Error: No se puede acceder a un atributo privado de la clase base, ni siquiera con super
        System.out.println("Marca: " + super.nombre); // Error de compilación
    }
}
