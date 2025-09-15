/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo;

/**
 *
 * @author Sebastian
 */
public class Empleado {
    public String nombre;
    public int salario;
    
    public Empleado(String nombre, int salario){
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public void MostrarDetalles(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }
}

class Gerente extends Empleado {
    private String departamento;
    
    public Gerente(String nombre,int salario, String departamento){
        super(nombre, salario);
        this.departamento = departamento;
    }
    @Override
    public void MostrarDetalles(){
        super.MostrarDetalles();
        System.out.println("departamento asociado:" + departamento);
    }
}