package tipos;

import java.util.Scanner;

public class Leer{
    public static void main(String[]args){
        //Declarar una variable:
        //Tipo de dato
        //Indicar el nombre de la variable
        //(opcional) asignar un valor a la variable
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();
        
        System.out.println("------------------");
        System.out.println("Hola" + nombre);
        
    }
}
