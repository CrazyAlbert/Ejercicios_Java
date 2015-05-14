
package Problema_5;

/**
 * @since 12/04/2015
 * @author Crazy
 * @description:
 * Hacer un programa que imprima los numeros impares hasta el 100 y que
 * imprima cuantos impares hay.
 */
public class Problema_5 {
    public static void main(String[] args){
		System.out.println("Numeros Impares y su conteo");
		int counter = 0;
		for(int i = 0 ; i <= 100 ; i ++){
			if( i%2 != 0 ){
				System.out. printf("%d\n" , i);
				counter = counter + 1;
			}
		}
		System.out.printf("\n El número de impares es %d\n\n", counter);
    }
}
