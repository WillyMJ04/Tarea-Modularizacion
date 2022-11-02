/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serializacion.ejemplo;

import java.io.Serializable;

/**
 *
 * @author Willy
 */


// Implementamos la serializacion
public class Automovil implements Serializable {
    
// Atributos
    private String color;
    private String modelo;
    private String marca;

    public Automovil(String color, String modelo, String marca) {
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String toString(){
        return ("\ncolor" + ":"+ this.color + "\nmodelo" + ":"+ this.modelo+ "\nmarca" + ":"+ this.marca);
    }


}
    
    
    

