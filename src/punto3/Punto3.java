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
public class Punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Persona nuevo= new Persona(1);
        Persona nuevo2= new Persona(4);
        System.out.println("La cantidad de personas es:"+ nuevo.cantPersonas);
        System.out.println("La cantidad de personas es :"+nuevo2.cantPersonas);
    }*/
        
       Scanner escaner = new Scanner(System.in); 
       int opcion;
       do{
        System.out.println("MENU DE OPCIONES");
        System.out.println("1.INGRESAR UN EMPLEADO");
        System.out.println("2.Salir");
        opcion=escaner.nextInt();
        switch(opcion){
            case 1:
                
                   Persona usuario1 = new Persona();
                   System.out.println("LA CANTIDAD DE PERSONAS ES DE : " + Persona.getCantidadPersonas());
                   System.out.println("NOMBRE DE LA PERSONA 1: " + usuario1.getNombre());
                   //USUARIO NUMERO 2
                    Persona usuario2 = new Persona();
                   System.out.println("LA CANTIDAD DE PERSONAS ES DE : " + Persona.getCantidadPersonas());
                   System.out.println("NOMBRE DE LA PERSONA 2: " + usuario2.getNombre());
                   //USUARIO 3
                    Persona usuario3 = new Persona();
                   System.out.println("LA CANTIDAD DE PERSONAS ES DE : " + Persona.getCantidadPersonas());
                   System.out.println("NOMBRE DE LA PERSONA 3: " + usuario3.getNombre());
                break;
                case 2:
        System.out.println("MUCHAS GRACIAS POR VISITAR MI CODIGO");
        break;
                
        }
        
       }
       while(opcion!=2);
       
}
}
