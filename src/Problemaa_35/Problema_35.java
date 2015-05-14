
package Problemaa_35;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @since  12/04/2015
 * @author Albert Alvarez
 * @description:
 * Hacer un programa que lea las calificaciones de un alumno en 10
 * asignaturas, las almacene en un vector y calcule e imprima su media.
 * Usando el segundo ejemplo, hacer un programa que busque una nota en el
 * vector.
 **/

public class Problema_35 {
	// Reader
		static String read() throws IOException {
			BufferedReader S = new BufferedReader(new InputStreamReader(System.in));
		return S.readLine()	;
		}
	// bucle For, uso de diferentes expresiones
    
    static void buscar() throws IOException {

try {	
	double notas [] = {4.5 , 6.2, 3.9, 5.6, 4.9, 5.6, 5.6, 5.8, 4.5, 6.5}, notaID;

	System.out.println("Ingrese una nota  a buscar : ");
notaID = Double.parseDouble(read());


boolean found = false;
for(int i = 0; i < notas.length;i++){
	if(notas[i] == notaID){
		found = true;
		break;
	}
}
	
    System.out.println((found) ? "El alumno tiene " + notaID +
        " entre sus calificaciones" : "No tiene " + notaID +
                " entre sus calificaciones");	
  }
        catch (NumberFormatException ioe){
            System.err.println("Usted solo puede ingresar numeros");
    buscar();
   }
  }
    public static void main(String[] args) throws IOException {
		buscar();
    }
}
