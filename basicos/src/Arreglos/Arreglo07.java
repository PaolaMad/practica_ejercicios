package Arreglos;

import java.util.Scanner;

/*
*Crear un programa en el cual se ingrese un numero de una tabla que se requiera
visualizar e ingresar otro numero para la cantidad de multiplos a generar
*Almacenar los valores en una matriz y mostrar los datos al finalizar el 
proceso
*/

public class Arreglo07{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int conf = 1;
        while (conf == 1) {         
            
            System.out.println("Ingrese el numero: ");
        int numero = sc.nextInt();
        
        System.out.println("Ingrese la cantidad de numeros que desea ver: ");
        int cantidad = sc.nextInt();
        
        int[][] multiplos = new int [cantidad][3];
              
        for (int i = 0; i < cantidad; i++) {
            multiplos[i][2] = numero * (i + 1);
            multiplos[i][1] = i + 1;
            multiplos[i][0] = numero;
        }
        
        System.out.println("La tabla del numero " + numero + " es: ");
        for (int i = 0; i < multiplos.length; i++) { 
            System.out.println(
                    multiplos[i][0] + " x " + multiplos[i][1] + " = " + multiplos[i][2]);
           
        }
            
            System.out.println("Desea continuar (Si=1/No=0)");
            conf = sc.nextInt();
        }
        
        
        
        
        
    }
}
