package Ejercicios;

import java.util.Scanner;

public class Juego{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRandom;
        int conf = 0;
        numRandom = (int) (Math.random()*20);
    
         do {            
             System.out.println("Intente adivinar el numero del 1-20");
             for (int i = 1; i <= 3; i++) {
                 int numero= sc.nextInt();
                 if (numero!=numRandom) {
                     System.out.println("Intente de nuevo");
                 }else{
                     System.out.println("Acertaste\n");
                     break;
                 }
             }
             System.out.println("Si desea seguir jugando ingrese 1"
                     + " en caso contrario, ingrese 0");
             conf = sc.nextInt();
             
        } while( conf==1 );
         
         System.out.println("Fin del Juego");
    }
}
