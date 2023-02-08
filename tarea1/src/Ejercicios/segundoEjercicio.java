package Ejercicios;

import java.util.Scanner;

public class segundoEjercicio{
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
