

package Problemaa_14;

import java.util.Scanner;

/**
 * @since 12/04/2015
 * @author Albert Alvarez
 * @description:
 * Hacer un programa que imprima el mayor y el menor de una serie de
 * cinco numeros que vamos introduciendo por teclado.
 */

public class Problema_14 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n[]={0,0,0,0,0};
        int max=0,min=999999;
        System.out.println("Introdusca el primer numero: ");
        n[0]=leer.nextInt();
        
        System.out.println("Introdusca el segundo numero: ");
        n[1]=leer.nextInt();
        
        System.out.println("Introdusca el tercer numero: ");
        n[2]=leer.nextInt();
        
        System.out.println("Introdusca el cuarto numero: ");
        n[3]=leer.nextInt();
        
        System.out.println("Introdusca el quinto numero: ");
        n[4]=leer.nextInt();
        
        for (int i = 0; i <= 4; i++) {
            if(n[i]>max){
                max=n[i];
            }
        }
        System.out.println("El numero mayor es: "+max);
        
        for (int i = 0; i <= 4; i++) {
            if(n[i]<min){
                min=n[i];
            }
        }
        System.out.println("El numero menor es: "+min);
            
    }
}

