

package com.mycompany.clase14.ejemplo.seccionb;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {

        int operacion;
        String respuesta;
        
        respuesta = "s";

        while (respuesta.toLowerCase().equals("s")) {

            operacion = 0;

            Scanner scan = new Scanner(System.in);

            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicación");
            System.out.println("4.- División");
            System.out.print("Ingrese la operación que desea realizar: ");

            operacion = scan.nextInt();

            switch (operacion) {
                case 1: suma();
                        break;
                case 2: resta();
                        break;
                case 3: //resultado = operandoUno * operandoDos;
                        break;
                case 4: //resultado = operandoUno / operandoDos;
                        break;
                default:System.out.println("Opción ingresada no es válida."); 
                        break;
            }
            
            System.out.print("Desea realizar otra operacion? (s/n) ");
            respuesta = scan.next();
        }
    }
    
    // Agregar nuevos métodos aquí
    public static void suma() {
        float operandoUno, operandoDos, resultado;
        
        operandoUno = operandoDos = resultado = 0.0f;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese primer operando: ");
        operandoUno = scan.nextFloat();
        
        System.out.print("Ingrese segundo operando: ");
        operandoDos = scan.nextFloat();
        
        resultado = operandoUno + operandoDos;
        
        System.out.println("El resultado de la suma es: " + resultado);
    }
    
    public static void resta() {
        
        float operandoUno, operandoDos, resultado;
        
        operandoUno = operandoDos = resultado = 0.0f;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese primer operando: ");
        operandoUno = scan.nextFloat();
        
        System.out.print("Ingrese segundo operando: ");
        operandoDos = scan.nextFloat();
        
        resultado = operandoUno - operandoDos;
        
        System.out.println("El resultado de la suma es: " + resultado);
    }
}
