/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[] = new int[10];
        System.out.println(arreglo);
        llenarArreglo(arreglo);
        MadrearArreglo(arreglo);
        ImprimirArreglo(arreglo);
    }
    public static void llenarArreglo(int[] arre){
        for (int i = 0; i < arre.length; i++) {
            arre[i] = (int)(Math.random()* 100);
        }
        System.out.println(arre);
    }
    public static void MadrearArreglo(int [] arre) {
        arre= new int[100];
        System.out.println(arre);
        
    }
    public static void ImprimirArreglo(int[] arre){
        for (int i = 0; i < arre.length; i++) {
            System.out.println("[" + arre[i] + "]");
        }
    }
    
}
