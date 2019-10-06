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
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int) (Math.random() * 100) + 1;
        }
        for (int i = 0; i < aiCopia.length; i++) {
            aiCopia[i] = aiDatos[i];
        }
        ImprimirArreglo(aiDatos);
        ImprimirArreglo(aiCopia);
        System.out.println(aiCopia + " " + aiDatos);
        aiDatos[0] = 99999;
        ImprimirArreglo(aiDatos);
        ImprimirArreglo(aiCopia);
    }
    
    public static void ImprimirArreglo(int[] aiImprimir){
        for (int i = 0; i < aiImprimir.length; i++) {
            System.out.print("["+aiImprimir[i]+"]");
        }
        System.out.println("");
    }
    
}
