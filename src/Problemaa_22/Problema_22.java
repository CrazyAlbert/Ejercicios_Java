
package Problemaa_22;

/**
 * @since 12/04/2015
 * @author Albert Alvarez
 * @description:
 * Hacer programa que imprima los numeros del 0 al 100, controlando
 * las filas y las columnas.
 */

public class Problema_22 {
     public static void main(String[] args) {
        int x=0,x2=1,x3=2;
        for (int i = 0; i < 34; i++) {
            System.out.println(x+"\t"+x2+"\t"+x3);
            x=x3+1;
            x2=x+1;
            if(x2!=100)
            x3=x2+1;
            else
                x3=100;
        }
    }
}