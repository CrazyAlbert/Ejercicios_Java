
package Problemaa_10;

import java.util.Scanner;

/**
 * @since 12/04/2015
 * @author Albert Alvarez
 * @description:
 * Hacer un programa donde se introdusca un numero por teclado y
 * que nos diga si es par o impar.
 */

public class Problema_10 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n=0;
        System.out.println("Ingresa un numero: ");
        n=leer.nextInt();
        if(n%2==0){  
             System.out.println(n+" El numero introducido es par");  
        }else{  
            System.out.println(n+" El numero introducido es impar");  
        }     
    }
}
