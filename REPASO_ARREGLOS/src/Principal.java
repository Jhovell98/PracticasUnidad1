import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        // TODO code application logic here
        double aGrupos[][];
        // Preguntar cuantos grupos //Filas
        System.out.println("Cuantos grupos tiene?");
        Scanner s = new Scanner(System.in);
        int nGrupos=s.nextInt();
        s.nextLine();
        aGrupos = new double[nGrupos][];//Filas 
        //Por grupo preguntar cantidad de alumnos 
        for (int i = 0; i < aGrupos.length; i++) {
            System.out.println("Cuantos alumnos hay en el grupo " + (i+1) + "?");
            int nAlumnos= s.nextInt();
            s.nextLine();
            aGrupos[i]= new double[nAlumnos];
        }
        for (int i = 0; i <aGrupos.length; i++) {
            for (int j = 0; j < aGrupos[i].length; j++) {
                System.out.println("Calificación del alumno ");
                aGrupos[i][j] = s.nextDouble();
                s.nextLine();
            }
        }
        //Imprimir
        double dAcum=0;
        
        for (int i = 0; i <aGrupos.length; i++) {
            for (int j = 0; j < aGrupos[i].length; j++) {
                System.out.println("[" + aGrupos[i][j] +"]");
                dAcum+= aGrupos[i][j];
            }
            System.out.println("\n PROMEDIO " + (dAcum/ aGrupos[i].length));
            dAcum=0;
           
        }
        
    }
}
