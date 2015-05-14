
package Problemaa_23;

import java.util.Scanner;

/**
 * @since 12/04/2015
 * @author Albert Alvarez
 * @description:
 * Hacer programa que se introdusca una frase por teclado. Imprimirla cinco
 * veces en filas consecutivas, pero cada impresion ir desplazada cuatro 
 * columnas hacia la derecha.
 */

public class Problema_23 {
 public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
      String f;
      System.out.println("Ingrese una palabra");
      f=leer.next();
    
         System.out.println(f);
          System.out.println("\t\t\t\t"+f);
           System.out.println("\t\t\t\t\t\t\t\t"+f);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t"+f);
             System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+f);
    }
}
