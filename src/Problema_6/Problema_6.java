
package Problema_6;

import java.util.Scanner;

/**
 * @since 12/04/2015
 * @author Albert Alvarez
 * @description:
 * Hacer un programa que imprima todos los numeros naturales que hay
 * desde la unidad hasta un numero que introducimos por teclado.
 */

public class Problema_6 {
    public static void main(String[] args){
	System.out.println("Numeros Naturales y su Limite");
		Scanner sc = new Scanner(System.in);
		System.out. printf("Introduce el límite: ");
		int n = sc.nextInt();
		int i = 1;
		while(i <= n){
			System.out. printf("%d\n", i);
			i++;
		}
		System.out. printf( "\n\n" );
    
  }
}
