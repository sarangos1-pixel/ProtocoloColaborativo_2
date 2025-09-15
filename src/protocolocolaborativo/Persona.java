    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo;

/**
 *
 * @author Sebastian
 */
public class Persona {
    public String nombre;
    public int edad;
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void Detalles(){
        System.out.println("nombre:" + nombre);
        System.out.println("edad:" + edad);
    }
}

class Estudiante extends Persona{
    private int Matricula;
    
    public Estudiante(String nombre, int edad, int matricula){
        super(nombre, edad);
        this.Matricula = matricula;
    }
    @Override
    public void Detalles(){
        super.Detalles();
        System.out.println("Precio matricula: " + Matricula  );
    }
    
}
