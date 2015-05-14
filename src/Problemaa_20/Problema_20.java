
package Problemaa_20;

import java.util.Scanner;

/**
 *@since 12/04/2015
 * @author Albert Alvarez
 * @description:
 * Hacer programa donde se calculel factorial de un numero, 
 * mediante subprogramas.
 */

public class Problema_20 {
     public static void main(String[] args) {
        int n1;
        Problema_20 prob = new Problema_20();
        
        Scanner esc = new Scanner(System.in);
          System.out.println("Ingrese un numero");
        n1= esc.nextInt();
          System.out.println(" Numero Factorial: "+prob.factorial(n1));
    }
    
    private double factorial(int a){
        double n1=a;
        for (int i = a; i > 2; i--) {
            n1 = n1*(i-1);
        }
        return n1;
    }
}
