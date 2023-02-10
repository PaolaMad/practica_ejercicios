/*
Convierta en expresiones algorítmicas las siguientes expresiones algebraicas.
Coloque paréntesis solamente donde sean necesarios, a cada expresión el
usuario debe ingresar sus valores desde el teclado.
*/

package Ejercicios;

import java.util.Scanner;


public class ExpresionesAlgebraicas{   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     
      //Ejercicio A
       float sumaFraccion = 3/2 + 4/3;
       System.out.println(
               "A) La respuesta de la fraccion 3/2 + 4/3 es: " + sumaFraccion);
       
       //Ejercicio B
        System.out.println("\nIngrese dos valores x, y");
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float B = ((1/(x-5)) - ((3*x*y)/4));
        System.out.println("B) El resultado de la operacion es: " + B);
        
        //Ejericio C
        sumaFraccion = 1/2 + 7;
        System.out.println("\nC) La suma 1/2 + 7 es: " + sumaFraccion);
        
        //Ejercicio D
        sumaFraccion = 7 + 1/2;
        System.out.println("\nD) La suma 7 + 1/2 es: "+ sumaFraccion);
        
        //Ejercicio E
        System.out.println("\nIngrese valor a: ");
        float a = sc.nextFloat();
        System.out.println("Ingrese valor b: ");
        float b = sc.nextFloat();
        System.out.println("Ingrese valor c: ");
        float c = sc.nextFloat();
        System.out.println("Ingrese valor d: ");
        float d = sc.nextFloat();
        System.out.println("Ingrese valor e: ");
        float e = sc.nextFloat();
        System.out.println("Ingrese valor f: ");
        float f = sc.nextFloat();
        System.out.println("Ingrese valor g: ");
        float g = sc.nextFloat();
        System.out.println("Ingrese valor h: ");
        float h = sc.nextFloat();
        System.out.println("Ingrese valor i: ");
        float i = sc.nextFloat();
        sumaFraccion = ((a*a)/(b-c)) + ((d-e)/(f-(g*h/i)));
        System.out.println("E) El resultado de la operacion es: "+ sumaFraccion);
        
        //Ejercicio F
        System.out.println("\nIngrese valores m: ");
        float m = sc.nextFloat();
        System.out.println("Ingrese valor n: ");
        float n = sc.nextFloat();
        System.out.println("Ingrese valor p: ");
        float p = sc.nextFloat();
        sumaFraccion = m/n + p;
        System.out.println("F) El resultado de m/n + p: " + sumaFraccion);
        
        //Ejercicio G
        System.out.println("\nIngrese un valor q: ");
        float q = sc.nextFloat();
        sumaFraccion = m + (n/(p-q)); 
        System.out.println("G) Haciendo uso de los valores ingresados "
                + " anteriormente, el resultado es: " + sumaFraccion);
        
        //Ejercicio H
        sumaFraccion = (a*a/b*b) + (c*c/ d*d);
        System.out.println(
                "\nH) La respuesta de la operacion es: " + sumaFraccion);
        
        //Ejercicio I
        System.out.println("\nIgrese un vslor r, s: ");
        float r = sc.nextFloat();
        float s = sc.nextFloat();
        sumaFraccion = (m + n/p)/ (q - r/s);
        System.out.println("\nI) El resultado es: " + sumaFraccion);
        
        //Ejercicio J
        sumaFraccion = (3*a + b) / c - (d + 5*e/ (f + g/2*h) );
        System.out.println("\nEl resultado de la operacion es: " + sumaFraccion);
        
        //Ejercicio K
        sumaFraccion = (a*a + 2*a*b + b*b) / (1/x*x + 2);
        System.out.println("\nEl resultado de la operacion: " + sumaFraccion);
        
    }
}