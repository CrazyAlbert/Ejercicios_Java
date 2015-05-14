
package Problemaa_18;

import java.util.Scanner;

/**
 * @since 12/04/2015
 * @author Albert Alvarez
 * @description:
 * Hacer un programa que cuente las veces que aparece una determinada
 * letra en una frase que introduciremos por teclado.
 */

public class Problema_18 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String l;
        int n=0;
                char letra;
        System.out.println("Ingrese una palabra: ");
        l=leer.next();
        System.out.println("Ingrese la letra que desea buscar dentro de la palabra: ");
        letra=leer.next().charAt(0);
        
        char []caracteres=l.toCharArray();
			for(int i=0;i<=caracteres.length-1;i++){
				if(letra==caracteres[i]){
					n++;
			}
				
            }
	System.out.println("Se encontro: "+n+" veces");
		
    }
}

