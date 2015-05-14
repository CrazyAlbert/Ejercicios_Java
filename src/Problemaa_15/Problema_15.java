
package Problemaa_15;

import java.util.Scanner;

/**
 * @since 12/04/2015
 * @author Albert Alvarez
 * @description:
 * Hacer un programa donde se introduscan dos numeros por teclado y
 * Imprimir los numeros naturales que hay entre ambos numeros empezando
 * por el mas pequeño, contar cuantos hay y cuantos de ellos son pares. 
 * Calcular la suma de los impares.
 */


public class Problema_15 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Scanner leer2=new Scanner(System.in);
        int x=10,y=0;
        System.out.println("Ingrese el primer numero: ");
        x=leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        y=leer2.nextInt();
        impresion(x,y);
        
    }

    public static void impresion(int x, int y){
        int menor=0,mayor=0;
        if(x<y){
            menor=x;
            mayor=y;
        }
        else
        {
            mayor=x;
            menor=y;
        }
        int i,cont=0,pares=0,impar=0;
        System.out.println("Los numeros ordenados de menor a mayor son: ");
         for ( i = 0; i <=mayor ; i++) {
             if(menor<=mayor){
             System.out.println(menor);
             menor++;
             cont++;
             if(menor%2==0){
                 pares++;
             }
             else{
                 if((menor%2==1)){
                 impar=menor+impar;
             }
             }
                     }   
         }
         System.out.println("La cantidad de numeros que hay entre ellos son: "+cont);
          System.out.println("El numero de pares que hay es: "+pares);
           System.out.println("La suma de los impares es: "+impar);
             
    }
}
