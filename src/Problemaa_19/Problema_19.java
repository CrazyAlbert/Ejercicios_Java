
package Problemaa_19;

import java.util.Scanner;

/**
 * @since 12/04/2015
 * @author Albert Alvarez
 * @description:
 * Hacer un programa que simule el funcionamiento de un reloj digital y
 * que permita ponerlo en hora.
 */

public class Problema_19 {
    public static void main(String[] args) 
    {
      Scanner leer=new Scanner(System.in);
      int hora=00;
      int min=00;
       System.out.println("Introdusca la hora: ");
       hora=leer.nextInt();
        System.out.println("Introdusca los minutos: ");
       min=leer.nextInt();
        System.out.println("El tiempo es: "+hora+":"+min);
        
        for (int i = 0; (hora<24); i++) 
        {
             
            if((hora<=24))
            {           
                if(min<59)
                {
                    min=min+1;
                    System.out.println("Son: "+hora+":"+min);    
                }
                else
                {
                    if((min==59)&&(hora<24))
                    {
                        hora=hora+1;
                        min=-1;
                    }
                }
            }
        }            
    }
}


