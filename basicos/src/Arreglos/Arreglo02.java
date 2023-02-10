package Arreglos;

import java.util.Random;

public class Arreglo02{
    public static void main(String[] args) {
            
        Random random = new Random();
        
        int[] numeros = new int[20];
        
        System.out.println("TAMAÑO ARREGLO" + numeros.length);
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1; //Para evitar 0 sumar 1
            System.out.println("numeros [" + i + "] = " + numeros[i]);
        }
    }
}
