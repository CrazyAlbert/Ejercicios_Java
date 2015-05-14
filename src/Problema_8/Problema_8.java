
package Problema_8;

import java.util.Scanner;

/**
 * @since 12/04/2015
 * @author Albert Alvarez
 * @description:
 * Hacer un programa que solo nos permita introducir S o N.
 */
public class Problema_8 {
    public static void main(String[] args) {
        char L='S';
        Scanner test=new Scanner(System.in);
        while((L=='S')||(L=='N')){
            System.out.println("Continuar ingresando la letra: ");
            L=test.next().charAt(0);
        }
        System.out.println("No se ingreso la letra S o N.");
    }
}

