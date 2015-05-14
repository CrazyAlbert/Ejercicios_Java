
package Problemaa_21;

import java.util.Scanner;

/**
 * @since 12/04/2015
 * @author Albert Alvarez
 * @description:
 * Hacer programa que que calcule independientemente la suma de los pares y
 * los impares de los numeros entre 1 y 1000, utilizando un switch.
 */

public class Problema_21 {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
       int l;
        System.out.println(" Ingrese el numero de la opcion que deseas elegir: ");
        System.out.println("1) Suma de numeros pares entre el 1 y 1000");
        System.out.println("2) Suma de numeros impares entre el 1 y 1000");
        l = leer.nextInt();
        
        switch(l)
        {
            case 1:
                int P =0;
                for (int i = 0; i <= 1000; i++) 
                {
                    if(i % 2==0)
                    {
                        P = P + i;
                    }      
                }    
            System.out.println("La suma de los numeros pares es: "+P);
            break;
            case 2:
                int I =0;
                for (int i = 0; i <= 1000; i++) 
                {
            if(i % 1==0)
            {
                 I = I + i;
            }
            
          }
               System.out.println("La suma de los numeros impares es: "+I);
                break;
        }  
    }
}
