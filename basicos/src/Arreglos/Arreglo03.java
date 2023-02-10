package Arreglos;

import java.util.Random;
import java.util.Scanner;

public class Arreglo03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        
        Random random = new Random();
        
        int[] numeros = new int[20];
        
        System.out.println("TAMAÑO ARREGLO" + numeros.length);
  
        boolean continuar = true; 
        
        while (continuar) {            
           for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1; //Para evitar 0 sumar 1
            System.out.println("numeros [" + i + "] = " + numeros[i]);
            
               System.out.println("Desea continuar (s/n)");
               String respuesta = sc.nextLine().toLowerCase();
               continuar = respuesta.equalsIgnoreCase("s");
        } 
     }
        
  }
}
