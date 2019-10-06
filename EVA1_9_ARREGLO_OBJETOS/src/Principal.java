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
        Prueba[] apArreglo = new Prueba[5];
        System.out.println(apArreglo);
        for (int i = 0; i <apArreglo; i++) {
            apArreglo[i] = new Prueba();
            System.out.println(apArreglo[i]);
            
        }
    }
    
}
