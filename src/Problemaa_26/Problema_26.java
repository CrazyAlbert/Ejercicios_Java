
package Problemaa_26;

import java.util.Scanner;

/**
 * @since 12/04/2015
 * @author Albert Alvarez
 * @description:
 * Hacer programa donde se introdusca una frase por teclado e
 * imprimirla en el centro de la pantalla.
 */

public class Problema_26 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
          String f;
          System.out.println("Ingrese una palabra");
           f=leer.next();         
            System.out.println("\t\t\t\t"+f+"\t\t\t\t"); 
    }
}
