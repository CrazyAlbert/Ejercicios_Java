
package Problema_7;

import java.util.Scanner;

/**
 * @since 12/04/2015
 * @author Albert Alvarez
 * @description:
 * Hacer un programa donde se introduscan tantas frases 
 * como queramos y contarlas.
 */

public class Problema_7 {
    public static void main(String[] args) {
         int p=0;
         char x='s';
         String urge2="hd";
         Scanner leer=new Scanner(System.in); 
         Scanner urge=new Scanner(System.in); 
         while((x=='s')||(x=='S')){
             System.out.println("Ingrese cualquier palabra: ");
             urge2=urge.next();
             p++;
             
             System.out.println("Desea continuar ingresando palabras? s/n: ");
              x=leer.next().charAt(0);
             
         }
         System.out.println("El numero de palabras ingresadas es: "+p);
     }
}
    

