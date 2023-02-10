/*
Declare dos variables numéricas, solicite al usuario que ingrese los valores para
las variables y muestre por salida del programa la suma, resta, multiplicación,
división.
*/

package Ejercicios;

import java.util.Scanner;

public class Operaciones01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer valor");
        int primerValor = sc.nextInt();
        System.out.println("Ingrese el segundo valor");
        int segundoValor = sc.nextInt();
        
        int suma = primerValor + segundoValor;
        int resta = primerValor - segundoValor;
        int multiplicacion = primerValor * segundoValor;
        float division = primerValor/segundoValor;
        
        System.out.println("La suma de los valores es " + suma);
        System.out.println("La resta de los valores es " + resta);
        System.out.println("La multiplicacion de los valores es " + multiplicacion);
        System.out.println("La division de los valores es " + division);
        
        
    }
}
