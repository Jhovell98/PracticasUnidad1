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
    public static void main(String[] args) {
        int aMatriz[][]= new int[3][5];
        int tMartiz[][]= new int[5][3];
        for (int i = 0; i <aMatriz.length; i++) {
            for (int j = 0; j <aMatriz[i].length; j++) {
                aMatriz[i][j]=(int)(Math.random()*100);
            }  
          }
        for (int i = 0; i <tMartiz.length; i++) {
            for (int j = 0; j <tMartiz[i].length; j++) {
                tMartiz[i][j]=aMatriz[j][i];
            }
        }
        Imprimir(aMatriz);
        Imprimir(tMartiz);
    }
    
    public static void Imprimir (int[][] args){
        for (int i = 0; i <args.length; i++) {
            for (int j = 0; j <args[i].length; j++) {
                System.out.print("[" + args[i][j] + "]");
            }
            System.out.println("");   
        }
        System.out.println("Cambia matriz");
   
    }
    
}
