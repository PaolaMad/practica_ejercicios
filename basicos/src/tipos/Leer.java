package tipos;

import java.util.Scanner;

public class Leer{
    public static void main(String[]args){
        //Declarar una variable:
        //Tipo de dato
        //Indicar el nombre de la variable
        //(opcional) asignar un valor a la variable
        
        Scanner scanner = new Scanner(System.in);
        
        System.err.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        System.err.println("------------------");
        System.err.println("Hola" + nombre);
        
    }
}
