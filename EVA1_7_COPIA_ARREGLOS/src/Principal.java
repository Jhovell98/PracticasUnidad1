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
        int aiDatos[] = new int[10];
        int aiCopia[] = new int[10];
        //Llenar con valores aleatorios
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("Datos originales");
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.print("[" + aiDatos[i] + "]");
        }
        System.out.println("\n" + aiDatos);
        aiCopia = aiDatos;
        System.out.println(aiCopia);
        System.out.println("\nDatos copiados");
        for (int i = 0; i < aiCopia.length; i++) {
            System.out.print("[" + aiCopia[i] + "]");
        }
        
    }
    
}
