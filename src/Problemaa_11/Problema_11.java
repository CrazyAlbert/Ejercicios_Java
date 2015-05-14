

package Problemaa_11;

import java.util.Scanner;

/**
 * @since 12/04/2015
 * @author Albert Alvarez
 * @description:
 * Hacer un programa donde imprima y cuente los multiplos de 3 desde la 
 * unidad hasta un numero que introducimos por teclado.
 */

public class Problema_11 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n=0,m=0;
        System.out.println("Ingrese el numero a calcular: ");
        n=leer.nextInt();
        for (int i=0; i<=n; i++) {
            if(i%3==0 && i!=0)
            {
                System.out.println("Multiplo: "+i);
                m++;
            }
            
    }
        System.out.println("La cantidad de multiplos son: "+m);
}
}
