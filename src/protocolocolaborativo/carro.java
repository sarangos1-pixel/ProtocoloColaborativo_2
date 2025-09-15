/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo;

/**
 *
 * @author Sebastian
 */
public class carro {
    private String marca; 

    public carro(String marca) {
        this.marca = marca;
    }
}

class auto extends carro {
    public auto(String marca) {
        super(marca);
    }
  
    public void mostrarMarca() {
        System.out.println("Marca: " + marca); // Error de compilación
        // 'marca' tiene acceso privado en Vehiculo por que que no se puede acceder
    }
}
