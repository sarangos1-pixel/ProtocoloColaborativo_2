/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package protocolocolaborativo;

/**
 *
 * @author Sebastian
 */
import java.util.Scanner;

public class ClasePruebaEmpleado {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        String nombre = key.nextLine();
        
        System.out.println("Ingrese su salario");
        int salario = key.nextInt();
        key.nextLine();
        
        System.out.println("departamento al que esta asociado");
        String departamento = key.nextLine();
        
        Gerente gerente = new Gerente(nombre, salario, departamento);
        
        gerente.MostrarDetalles();
    }
    
}
