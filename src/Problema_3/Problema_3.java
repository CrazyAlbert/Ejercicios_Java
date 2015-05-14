
package Problema_3;

/**
 * @since 12/04/2015
 * @author Crazy
 * @description:
 * Hacer un pseudocodigo que imprima los numeros pares entre 0 y 100.
 */
public class Problema_3 {
    
    public static void main(String[] args) {
    int numero=1;
    int limite=100;
    
    while(numero <= 100){
        if(numero%2==0){
        System.out.println(numero);
        }
    numero++;
     }
    }
}
