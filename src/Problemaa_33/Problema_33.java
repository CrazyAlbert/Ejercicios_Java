
package Problemaa_33;
import java.io.*;

/**
 * @since  12/04/2015
 * @author Albert Alvarez
 * @description:
 * Hacer un programa donde se cree un array unidimensional de 20 elementos 
 * con nombres de personas.visualizar los elementos de la lista debiendo ir 
 * cada uno en una fila distinta.
 */
public class Problema_33 {

	// Reader
		static String read() throws IOException {
			BufferedReader S = new BufferedReader(new InputStreamReader(System.in));
		return S.readLine()	;
		}
	// bucle For, uso de diferentes expresione
	
   static void arreglo(){
    String [] nombres = {"Claudio" , "Lorena", "Carolina", "Jorge", "Daniela",
                    "Luis", "Pedro", "Roberto","Maria", "Marcela", "Florencia", 
                    "Bernarda", "Mauricio", "Felipe", "Margarita", 
	            "Fabiola", "Rodolfo", "Mario", "Camila", "Rafael"};
	
	for(int i = 0; i < nombres.length;i++){
		
		System.out.println(nombres[i]);
		
	}
    }
   public static void main(String[] args) throws IOException {
		arreglo();
   }
}
