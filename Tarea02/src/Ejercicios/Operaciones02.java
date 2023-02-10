/*
Desarrolle un programa en donde el usuario debe ingresar dos números y el
programa muestra como resultado la operación (a+b)*(a-b).
*/
package Ejercicios;

import java.util.Scanner;

public class Operaciones02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Igrese un valor");
        int primerValor = sc.nextInt();
        System.out.println("Ingrese otro valor");
        int segundoValor = sc.nextInt();
        
        int suma = primerValor + segundoValor;
        int resta = primerValor - segundoValor;
        int operacion = suma * resta;
        
        System.out.println("El resultado de la operacion es " + operacion);
        
    }
}
