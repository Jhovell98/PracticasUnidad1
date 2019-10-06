
import java.util.Scanner;
import javax.sound.midi.Soundbank;


public class Principal {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.println("Introduce el numero de edades ");
        x = scan.nextInt();
        float media;
        int cont=0;
        int nEdades[]=new int[x];
        for (int i = 0; i <nEdades.length; i++) {
            System.out.println("Introduce la edad " + (i+1));
            nEdades[i]=scan.nextInt();
        }
        Imprimir(nEdades);
        for (int i = 0; i < nEdades.length; i++) {
            cont= cont + nEdades[i];
        } 
        media= cont/nEdades.length;
    }
    
    
 public static void Imprimir(int[] args){
            for (int i = 0; i <args.length; i++) {
                System.out.println("La edad " + (i+1) + " es " + args[i] );
            }
            System.out.println("");
}
}


