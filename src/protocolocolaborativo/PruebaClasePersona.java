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

public class PruebaClasePersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        String nombre = key.nextLine();
        
        System.out.println("Ingrese su edad");
        int edad = key.nextInt();
        
        System.out.println("cuanto paga en matricula");
        int Matricula = key.nextInt();
        
       Estudiante alumno = new Estudiante(nombre, edad, Matricula);
       
       alumno.Detalles();
    }
    
}
