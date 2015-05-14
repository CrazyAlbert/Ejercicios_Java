
package Problema_4;

/**
 * @since 12/04/2015
 * @author Crazy
 * @description:
 * Hacer un programa que imprima la suma de los 100 primeros numeros.
 */
public class Problema_4 {
    public static void main(String[] args){
		System.out.println("Suma de los 100 primeros números enteros");
		int result = 0;
		for(int i = 0 ; i <= 100 ; i ++){
			result = result + i;
		}
		System.out. printf("El resultado es %d\n\n" , result);
        }
}
