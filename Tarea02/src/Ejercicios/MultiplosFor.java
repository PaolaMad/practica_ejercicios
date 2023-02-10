/*
Desarrollé un programa en el cual se puede imprimir la tabla de multiplicar de
X número indicado por el usuario usando el ciclo for, debe mostrar los
múltiplos hasta 10.
*/

package Ejercicios;

import java.util.Scanner;

public class MultiplosFor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese numero para ver sus multiplos: ");
        int numero = sc.nextInt();
        System.out.println("------------");
        
        for (int i = 1; i <= 10; i++) {
            int multiplos = numero * i;
            System.out.println(multiplos);
        }
        
    }
}
