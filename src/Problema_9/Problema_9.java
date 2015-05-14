
package Problema_9;

import java.util.Scanner;

/**
 * @since 12/04/2015
 * @author Albert Alvarez
 * @description:
 * Hacer un programa donde se introdusca un numero por teclado y 
 * que nos diga si es positivo o negativo.
 */
public class Problema_9 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n=0;
        System.out.println("Ingrese un numero: ");
        n=leer.nextInt();
        if (n>0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }
    }
}
