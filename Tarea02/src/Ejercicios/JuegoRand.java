/*
Investigue el objeto Random de java y desarrolle un juego en el cual el usuario
debe adivinar un número generado en un rango de 1 a 20 con un límite de tres
intentos, adicional a esto cuando termine el juego el programa le debe realizar
la pregunta al usuario si quiere seguir jugando para reiniciar el juego.
*/

package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class JuegoRand{
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numero = random.nextInt(20);
        System.out.println("-----------JUEGO------------\n");
        int conf = 1;
        while (conf == 1) {            
            
            for (int i = 1; i <= 3; i++) {
            System.out.println("Intente adivinar el numero del 1-20:");
            int num = sc.nextInt();
            if (num != numero) {
                System.out.println("Inenta de nuevo");
            }else{
                System.out.println("Felicidades, acertaste");
                break;
                        
         }
       }  
            System.out.println("Desea continuar (s=1/no=0)");
            conf = sc.nextInt();
     }
        System.out.println("--------------FIN DEL JUEGO-------------");
   }
}
