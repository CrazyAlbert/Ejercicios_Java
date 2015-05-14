
package Problemaa_36;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @since  12/04/2015
 * @author Albert Alvarez
 * @description:
 * Hacer un programa que genere una matriz de 4 filas y 5 columnas 
 * con numeros aleatorios entre 1 y 100, e imprimirla.
 **/

public class Problema_36 {
    
    // Reader
		static String read() throws IOException {
			BufferedReader S = new BufferedReader(new InputStreamReader(System.in));
		return S.readLine()	;
		}
	// bucle For, uso de diferentes expresiones
    
  static void matriz(){
	int [][] valores = new int [4][5];
	int intervalo = 101;
        for(int outer_index = 0;outer_index < valores.length;outer_index++){
        for(int inner_index = 0; inner_index < valores[outer_index].length;inner_index++){
	valores[outer_index][inner_index] = (int) (Math.random() * intervalo); 		
		
			System.out.println("valores [" + outer_index+ "][" 
                                + inner_index +"]" + " = " 
                                + valores[outer_index][inner_index] );
		
		}
	}
	
   }
  
  public static void main(String[] args) throws IOException{
	matriz();
 }
}
