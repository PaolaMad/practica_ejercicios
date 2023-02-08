package Ejercicios;

import java.util.Scanner;

public class ExpresionesAlgoritmicas{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        float a = 3/2 + 4/3;
        System.out.println(a);
        
        System.out.println("Ingrese dos valores x,y: ");
        int x= sc.nextInt();
        int y = sc.nextInt();
        float b = ((1/(x-5)) - (3*x*y)/4);
        System.out.println(b);
        
        float c = 1/2 + 7;
        System.out.println(c);
        
        float d = 7 + 1/2;
        System.out.println(d);
        
        
    }
}
