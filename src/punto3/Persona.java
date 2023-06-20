/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

import java.util.Scanner;

/**
 *
 * @author Ignacio Gaynor
 */
public class Persona {
    
//constructor
    
    
   public static int cantPersonas = 0;
   String Nombre;

    public Persona() {
        Scanner lector = new Scanner(System.in);
        System.out.println("porfavor ingrese el nombre del cliente");
        this.Nombre = lector.nextLine();
        cantPersonas++;
    }
    //AHOORA OBTENDREMOS LA CANTIDAD ESTATICA DE LA CANTIDAD DE PERSONAS
    public static int getCantidadPersonas(){
        return cantPersonas;
    }
    public String getNombre(){
        return Nombre;
    }

    
    

   

  
  
    
}
