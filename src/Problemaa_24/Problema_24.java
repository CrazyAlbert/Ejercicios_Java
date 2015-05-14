
package Problemaa_24;

import java.util.Scanner;

/**
 * @since 12/04/2015
 * @author Albert Alvarez
 * @description:
 * Hacer programa que compruebe si un numero mayor o igual
 * que la unidad es primo.
 */

public class Problema_24 {
   public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n=0,y=0;
        System.out.println("Ingrese un numero");
        n =leer.nextInt();  
       if (n >= 1) {
            for (int i = 1; i < (n + 1); i++) {
                if (n % i == 0) {
                    y++;
                }
            }
            if (y != 2) {
                System.out.println("El numero ingresado no es un numero primo");
            } else {
                System.out.println("El numero ingresado si es un numero primo");
            }
       }
    }
}
