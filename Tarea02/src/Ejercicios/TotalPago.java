/*
Desarrolle un programa en el cual le pida una cantidad de un producto, el
precio y el programa devuelva la cantidad total a pagar.
*/

package Ejercicios;

import java.util.Scanner;

public class TotalPago{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca la cantidad del producto: ");
        int cantidad = sc.nextInt();
        System.out.print("Introduza el precio del producto: ");
        int precio = sc.nextInt();
        
        int totalPagar = cantidad * precio;
        
        System.out.println("El total que debe pagar es " + totalPagar);
        
    }
}
