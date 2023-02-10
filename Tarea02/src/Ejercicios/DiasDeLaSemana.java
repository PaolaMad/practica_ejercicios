/*
Desarrolle por medio de la instrucción switch un programa en el cual el usuario
ingrese un número de día de la semana y el programa devuelve el nombre del
día.
*/

package Ejercicios;

import java.util.Scanner;

public class DiasDeLaSemana{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de dia de la semana: ");
        int num = sc.nextInt();
        
        switch (num) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4: 
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("El numero ingresado no es valido");
                break;
        }
    }
}
