
package Problemaa_29;
import java.io.*;
import java.math.*;

/**
 * @since 12/04/2015
 * @author Crazy
 * @description:
 * Simular cien tiradas de dos dados y contar las veces que entre los dos
 * suman 10.
 */
public class Problema_29 extends Print {

	// BufferedReader
		static String read() throws IOException {
		String s1;	
			BufferedReader S = new BufferedReader(new InputStreamReader(System.in));
		s1 = S.readLine();	
			return s1;
		}
    static void dados() throws IOException {
int tiradas = 1,conta = 0, dado1 = 7, dado2 = 7,veces,total;
	System.out.println("Ingrese la cantidad de veces que desea tirar los dados : ");
	veces = Integer.parseInt(read());
System.out.println("Ingrese la probabilidad que desea calcular (ejem. ambos sumen 10) :");
total = Integer.parseInt(read());
	while(tiradas++ <= veces){
		dado1 *= Math.random();
		if(dado1 == 0)
			dado1 = 1;
		dado2 *= Math.random();
		if(dado2 == 0)
			dado2 = 1;

if((dado1 + dado2) == total){
	conta++;
}
	
dado1 = 7;
dado2 = 7;
	}
	
System.out.println("Los dados fueron lanzados " + veces + " veces y en " 
        + conta + " ocaciones la suma de ambos fue " +total);	
	
}

public static void main(String[] args) throws IOException {
		
dados();		

}

    public Problema_29(String s1) {
        super(s1);
    }
}
