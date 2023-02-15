package Arreglos;

import java.util.Scanner;

public class Arreglo05{
    public static void main(String[] args) {
            //El usuario determina el tamaño de la matriz
            //El usuario ingresa los datos de la matriz
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el numero de filas");
            int filas = sc.nextInt();
            
            System.out.println("Ingrese el numero de filas");
            int columnas = sc.nextInt();
            
            
            int[][] matriz = new int[filas][columnas];
            
            System.out.println("Ingrese los valores de la matriz");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(
                            "Valor para la fila " + i + "columna " + j +" : " );
                    matriz[i][j] = sc.nextInt();
                }
        }
            for (int i = 0; i < matriz.length; i++) {
                 for (int j = 0; j < 3; j++) {
                 System.out.print(" " + matriz[i][j] + "\t");
            }
            System.out.println("\n");
        }
            
            
            
    }
}
