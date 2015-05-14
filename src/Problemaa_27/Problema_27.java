
package Problemaa_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @since 12/04/2015
 * @author Albert Alvarez
 * @description:
 * Hacer programa donde realice la tabla de multiplicar de 
 * un numero entre 0 y 10.
 */

public class Problema_27 extends Print {

	// BufferedReader
		static String read() throws IOException {
		String s1;	
			BufferedReader S = new BufferedReader(new InputStreamReader(System.in));
		s1 = S.readLine();	
			return s1;
		}

    static void tabla() throws IOException {
int tabla;	
	Print1("Ingrese la tabla que desea calcular : ");
	tabla = Integer.parseInt(read());
	
for(int multi = 0,resul = 0;multi <= 10;multi++,resul = tabla * multi){
	
	System.out.println(tabla + " * " + multi + " = " + resul );
      }
    }
    public static void main(String[] args) throws IOException {
		tabla();
    }
}
