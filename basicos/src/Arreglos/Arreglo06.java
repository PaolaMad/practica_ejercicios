package Arreglos;

import java.util.Scanner;

/*
Escribir un programa donde, en una matriz de nxn definida por el usuario
se suma la diagonal de izquierda a derecha, despues que el usuario ingreso
los datos de la matriz
*/

public class Arreglo06{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Ingrese el numero de filas: ");
            int n = sc.nextInt();

            int [][] matriz = new int[n][n];
            int suma = 0;
          
            for (int f = 0; f < matriz.length; f++) {
                for (int c = 0; c < matriz[f].length; c++) {
                    System.out.print("" + f + "," + c + " : ");
                    matriz[f][c] = sc.nextInt();
                }
        }
       
           for (int f = 0; f < matriz.length; f++) {
               for (int c = 0; c < matriz[f].length; c++) {
                   System.out.print("\t " + matriz[f][c]);
               }
               System.out.println("");
        }
           
           for (int f = 0; f < matriz.length; f++) {
                for (int c = 0; c < matriz[f].length; c++) {
                   suma += matriz[0][f];
               }
        }
            
           System.out.println("La suma es: " + suma);
    }
}
