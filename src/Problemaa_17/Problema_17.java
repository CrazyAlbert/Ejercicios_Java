
package Problemaa_17;

import java.util.Scanner;

/**
 * @since 12/04/2015
 * @author Albert Alvarez
 * @description:
 * Hacer un programa donde imprima cuente y sume los multiplos de 2 que hay 
 * entre una serie de numeros, tal que el segundo sea mayor o 
 * igual que el primero.
 */

public class Problema_17 {
    public static void main(String[] args) {
     int n1 = 0, n2 = 0, temp, cont1 = 0, sumar = 0;
      Scanner esc = new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
            n1 = esc.nextInt();
        System.out.println("Ingrese el segundo valor");
            n2 = esc.nextInt();
            
        if (n2 < n1) {
            temp = n2;
            n2 = n1;
            n1 = temp;
        }
        for (int i = n2; i >= n1; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
                cont1++;
                sumar = sumar + i;
            }
        }
        System.out.println("La cantidad de numeros pares encontrados son: " + cont1);
        System.out.println("La suma de numeros pares encontrados son: " + sumar);
    }
}
  

