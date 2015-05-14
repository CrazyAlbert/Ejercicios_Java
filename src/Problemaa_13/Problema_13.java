
package Problemaa_13;

/**
 * @since 12/04/2015
 * @author Albert Alvarez
 * @description:
 * Hacer un programa que imprima y cuente los numeros que son multiplos 
 * de 2 o de 3 que hay entre 1 y 100.
 */

public class Problema_13 {
    public static void main(String[] args) {
          int cont1 = 0, cont2=0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Multiplo de 2: "+i);
                cont1++;
            }else if(i % 3 == 0)
            {
                System.out.println("Multiplo de 3: "+i);
                cont2++;
            }
        }
     System.out.println("La cantidad de numeros multiplos de 2 es: "+ cont1);
     System.out.println("La cantidad de numeros multiplos de 3 es: "+ cont2);
    }
}
