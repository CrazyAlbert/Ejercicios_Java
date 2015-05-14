
package Problemaa_31;
import java.io.*; 
/**
 *
 * @author Crazy
 */
public class Problema_31 {

public static void main (String var[]) throws IOException { 
 int num1=0, num2=0, result, opcion; 
 String menu, captura; 

   System.out.println("** Menu de Operaciones **"); 
   System.out.println("** 1) Suma **"); 
   System.out.println("** 2) Resta **"); 
   System.out.println("** 3) Multiplicacon **"); 
   System.out.println("** 4) Division **"); 
   System.out.println(""); 
  BufferedReader    ingreso	= new BufferedReader(new InputStreamReader (System.in)); 
   System.out.println("Digite segun el menu la operaciun que desea realizar: "); 
    menu = ingreso.readLine(); 
    opcion = Integer.parseInt(menu); 

if (opcion < 5) { 
    System.out.print("Digite el primer numero: "); 
    captura = ingreso.readLine(); 
    num1 = Integer.parseInt(captura); 

    System.out.print("Digite el segundo numero: "); 
    captura = ingreso.readLine(); 
    num2 = Integer.parseInt(captura); 
    } 
   switch(opcion) { 
    case 1: 
        result = num1 + num2; 
        System.out.print("El resultado de la suma es: "+result); 
        System.out.println(""); 
        break; 

    case 2: 
        result = num1 - num2; 
        System.out.print("El resultado de la resta es: "+result); 
        System.out.println(""); 
        break; 

    case 3: 
        result = num1 * num2; 
        System.out.print("El resultado del producto es: "+result); 
        System.out.println(""); 
        break; 

    case 4: 
        result = num1 / num2; 
        System.out.print("El resultado de la division es: "+result); 
        System.out.println(""); 
        break; 

            default : 
             num1 = 0; 
             num2 = 0; 
             result = 0; 
        } 
    } 
}

