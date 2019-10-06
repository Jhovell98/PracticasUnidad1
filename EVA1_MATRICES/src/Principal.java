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
        int aMatriz[][] = new int [3][5];
        //For anidado
        for (int i = 0; i < aMatriz.length; i++) {//Filas 
            for (int j = 0; j < aMatriz[i].length; j++) {
                aMatriz[i][j] = (int)(Math.random() * 100);
                
            }
        }
        //Imprimir la matriz
        for (int i = 0; i <aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
                System.out.print("[" + aMatriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
