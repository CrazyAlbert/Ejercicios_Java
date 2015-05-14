
package Problemaa_32;
import java.io.*;
/**
 * @since 12/04/2015
 * @author Crazy
 * @description:
 * Hacer un programa que nos permita introducir un numero por teclado y sobre 
 * el se realicen las siguientes operaciones: comprobar si es primo, hallar su
 * factorial o imprimir su tabla de multiplicar.
 */
public class Problema_32 extends Print {
static int op;	
	
	// Metodo lector	
	static String read() throws IOException {
		String s1;
	BufferedReader S = new BufferedReader(new InputStreamReader(System.in));
		s1 = S.readLine();
	return s1;
	}


static void calculo() throws IOException {
 int numero, op;
	
 System.out.println("Ingrese un numero : ");
    numero = Integer.parseInt(read());
    System.out.println("Que desea Calcular : ");
    
        Print3("1) Si es primo");
        Print3("2) Su factorial");
        Print3("3) Tabla de multiplicar");
        Print3("4) Salir");
        Print3("Ingrese una opcion : ");
        
    op = Integer.parseInt(read());
    
    switch (op){
        case 1 : primo(numero) ; break;
        case 2 : factorial(numero); break;
        case 3 : tabla(numero); break;
        case 4 : close(); break ;
    }

 }
static void primo(int numero) throws IOException {
	boolean primo = true;
	for(int conta = 2;conta < numero && (primo);conta++){
		if(numero % conta == 0){
			primo = false;
		}
	}
System.out.println((primo) ? "El numero es primo !" : " El numero no es primo ! ");	
Print3("Desea realizar otra operacion Si o No : ");
Problema_32.op = (char) System.in.read();
switch (op){
	case 'y' : calculo();
	case 'n' : close();break;
 }
 }

static void factorial(int numero) throws IOException {
int temp = numero,factorial = 1;
while(temp > 0){
	
	factorial *= temp--;
}
System.out.println(numero + "! = " +factorial);	
Print3("Desea realizar otra operacion Si o No : ");
Problema_32.op = (char) System.in.read();
 }
static void tabla(int numero) throws IOException {
	int conta = 1;
	while(conta <= 10){
		
		System.out.println(numero + " * " + conta + " = " + (numero * conta++));

	}
	Print3("Desea realizar otra operacion : ");
	Problema_32.op = (char) System.in.read();
 }
static void close(){
	System.out.println("Fin del programa !");
 }

public static void main(String[] args) throws IOException {
		// Creacion de objetos
	calculo();	

 }

}
