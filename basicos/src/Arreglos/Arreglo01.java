package arreglos;

public class Arreglo01{
    public static void main(String[] args) {
            
        //Declaracion de un arreglo de enteros con tamaño de 5
        int [] numeros = new int[5];
        
        //Inicializar los elementos del arreglo
        numeros[0] = 3;
        numeros[1] = 2;
        numeros[2] = 9;
        numeros[3] = 8;
        numeros[4] = 90;
       
        //Acceder a valores del arreglo
       // System.out.println(numeros[3]);
       
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }
       
    }
}
