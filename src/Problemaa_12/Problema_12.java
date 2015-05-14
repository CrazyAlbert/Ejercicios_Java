
package Problemaa_12;

/**
 * @since 12/04/2015
 * @author Albert Alvarez
 * @description:
 * Hacer un programa que imprima los numeros del 1 al 100. Que calcule la
 * suma de todos los numeros pares por un lado, y por otro, la de todos los
 * impares.
 */

public class Problema_12 {
    public static void main(String[] args) {
        int n=0,Par=0, Imp=0;
        
        for (int i = 0; i <= 100; i++) {
            if(i % 2==0)
            {
                Par= Par + i;
            }
            else
            {
                Imp= Imp + i;
            }
        }
     System.out.println("La suma de los numeros pares es: "+Par);
     System.out.println("La suma de los numeros impares es: "+Imp);
    }
}
