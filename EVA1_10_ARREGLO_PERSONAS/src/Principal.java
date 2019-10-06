
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan Aguilera
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
        System.out.println("¿Cuantos nombres desea introducir?");
        int x = in.nextInt();
        Persona[] apNOriginal = new Persona[x];
        Persona[] apAOriginal = new Persona[x];
        Persona[] apNCopia = new Persona[x];
        Persona[] apACopia = new Persona[x];
        for (int i = 0; i < apNOriginal.length; i++) {
            apNOriginal[i] = new Persona();
            apAOriginal[i] = new Persona();
            System.out.println("Introduzca el nombre #" + (i + 1));
            apNOriginal[i].nombre = in.next();
            System.out.println("Introduzca el apellido #" + (i + 1));
            apAOriginal[i].apellido = in.next();
        }
        for (int i = 0; i < apNOriginal.length; i++) {
            apNCopia[i] = new Persona();
            apACopia[i] = new Persona();
            apNCopia[i].nombre = apNOriginal[i].nombre;
            apACopia[i].apellido = apAOriginal[i].apellido;
            System.out.println("Nombre #" + (i + 1) + ": "+apNOriginal[i].nombre + " " + apAOriginal[i].apellido);
            System.out.println("Copia #" + (i + 1) + ": "+apNCopia[i].nombre + " " + apACopia[i].apellido);
        }
        
    }
    
}

class Persona{
    String nombre;
    String apellido;
}
