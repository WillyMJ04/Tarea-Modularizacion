
package serializacion.ejemplo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerializacionEjemplo { // Inicio Public Class

    
    public static void main(String[] args) { // Inicio main
 
        // Escritura de archivos
        
       //Instanciamos nuestro objeto
       
       Automovil auto1;
       Automovil auto2;
       
       try{
          File archivo = new File("C:\\Users\\acer\\Desktop\\ArchSerializable\\archivo.txt");
          
          FileOutputStream flujo = new FileOutputStream(archivo);
          
          ObjectOutputStream write = new ObjectOutputStream(flujo);
          
          auto1 = new Automovil("Azul","323","BMW");
          auto2 = new Automovil("Verde","AMG","Mercedez");
          
          write.writeObject(auto1);
          write.writeObject(auto2);
       

       } 
       catch(FileNotFoundException e){
           e.printStackTrace();
           
       }
        catch (IOException e){
            e.printStackTrace();
        }
        
      
        
    } // Fin main
    
    
} // Fin Public Class
