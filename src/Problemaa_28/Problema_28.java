
package Problemaa_28;
import java.io.*;
import java.math.*;

/**
 * @since  12/04/2015
 * @author Albert Alvarez
 * @description:
 * Simular el lanzamiento de una moneda al aire e imprimir si ha salido 
 * cara o cruz.
 */

public class Problema_28 extends Print {

	// Buffered Reader
		static String read() throws IOException {
		String s1;	
			BufferedReader S = new BufferedReader(new InputStreamReader(System.in));
		s1 = S.readLine();	
			return s1;
		}
                
static void moneda() throws IOException {
char op;
	Print3("Desea tirar la moneda (s/n) : ");
	op = (char) System.in.read();
double moneda;	
if (op == 's' || op == 'S'){
moneda = Math.random();		
System.out.println(moneda);
		if(moneda < 0.5){
			System.out.println("La moneda da cara !");
		}
		else {
			Print3("La moneda da Cruz !");
		}
	}
else {
	Print3("La moneda no ha sido lanzada");
  }
 }

 public static void main(String[] args) throws IOException {
		// Creacion de objetos
	moneda();	

 } 
 public Problema_28(String s1) {
        super(s1);
    }
}

