package Ejercicios;

import java.util.Scanner;

public class MultiplosWhile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(
                "Introduzca el numero del cual desea ver sus multiplos:");
        int numero = sc.nextInt();
        System.out.println("Introduzca un limite de multiplos");
        int limite = sc.nextInt();
        System.out.println("---------------------");
        int i = 1;
        
        while (i<=limite) {            
                int multiplos = numero * i;
                System.out.println(multiplos);
                i++;
        }
        
    }
}

