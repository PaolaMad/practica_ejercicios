package estructuraConrol;

import java.util.Scanner;

/*
    Solicitar 3 notas al usuario y calcular el promedio,
    mostrar un mensaje segun el promedio obtenido
    promedio menor a 70 reprobado
    promedio mayor a 70 aprobado
    promedio mayor a 80 bueno
    promedio mayor a 90 sobresaliente    
        
*/

public class Promedio{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Ingrese su primer nota");
        int notaUno = sc.nextInt();
        System.out.println("Ingrese su segunda nota");
        int notaDos = sc.nextInt();
        System.out.println("Ingrese su tercer nota");
        int notaTres = sc.nextInt();
        
        int suma = notaUno + notaDos + notaTres;
        
        float promedio = suma/3;
        
        if (promedio >= 70 && promedio <= 70) {
            System.out.println("Esta aprobado");
        }else{
            System.out.println("Esta reprobado");
        }
        
        if (promedio >=80 && promedio<=90) {
            System.out.println("Su promedio es Bueno");
        }else if (promedio >= 90 && promedio <= 100) {
            System.out.println("Su promedio es Sobresaliente");
        }
        
     } 
}