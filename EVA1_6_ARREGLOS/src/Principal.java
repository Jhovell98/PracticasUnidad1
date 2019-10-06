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
        //Devlaracion
        int aiDatos[],a, b;
        int[] aiDatos2, x, y;
        //
        int aiCopia[];
        //Iniciacion del arreglo
        aiDatos = new int[100];
        //Llenar con valores aleatorios 
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int) (Math.random() * 100) + 1;
        }
        //Son objetos 
        //La memoria es consecutiva
        //Son de acceso rapido
        aiDatos[4] = 5000;
        aiDatos[69] = 500;
        //Son muy rapidos 
        //Son inmutables
        
        
    }
    
}
