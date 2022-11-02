
package serializacion.ejemplo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author acer
 */
public class Uso_De_Vector { //Inicio de la clase
    //Para iniciar tiene que tener un Metodo Main
    public static void main(String[] args) throws ClassNotFoundException { //Inicio Main
      
        // Crear la instancia de la clase vector 
       
        Vector v = new Vector ();
        
        // Crear las instancias de la clase Automovil
        
        Automovil auto1 = new Automovil("Negro","AMG","Mercedez");
        //Instancia de la clase Vector
        v.add(auto1);
        Automovil auto2 = new Automovil("Blanco","Civic","Honda");
         //Instancia de la clase Vector
        v.add(auto2);
        Automovil auto3 = new Automovil("Rojo","Lancer","Mitsubishi");
         //Instancia de la clase Vector
        v.add(auto3);
        
        try{ // Inicio Try
            //Uso de la clase File
            
            File archivo = new File("C:\\Users\\acer\\Desktop\\ArchSerializable\\archivo.txt");
            FileOutputStream flujo = new FileOutputStream(archivo);
            ObjectOutputStream write = new ObjectOutputStream(flujo);
            // Escribiendo nuestro vector en el archivo
            write.writeObject(v);
           
           // Uso de la clase FileInputStream 
           FileInputStream  input = new FileInputStream (archivo);
           // Uso de la clase ObjectInputStream
           ObjectInputStream flujo2 = new ObjectInputStream(input);
           
           // Leerlo
         v = (Vector)flujo2.readObject();
           
           
           
        } // Fin Try 
        
        catch(FileNotFoundException e){ // Inicio Catch 1
            e.printStackTrace();
        
        } // Fin Catch 1
       
        catch(IOException e){ // Inicio Catch 2
            e.printStackTrace();
        
        } // Fin Catch 2
        
        catch(ClassNotFoundException e){ // Inicio Catch 3
             e.printStackTrace();
           
        } // Fin Catch 3
       
        
         // Mostrar en la pantalla
        // Clase Iterador
        
        Iterator i = v.iterator();
        while(i.hasNext()){ // Inicio del While
           auto1 = (Automovil)i.next();
            System.out.println(auto1.toString()); // Para convertir
                                                  //Lo que tiene la clase a String  
        } // Fin del While    
       
        
        
        
        
        
    } //Fin Main
    
  
} //Fin de la clase
