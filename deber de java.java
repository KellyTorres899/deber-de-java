//Kelly Torres//
package aja;
import java.util.Scanner;
public class Aja {
    public static void main (String [] args){
        Scanner entrada= new Scanner (System.in)
        int cant=1;
        int suma=0;
        float pro=0;
        while(cant<=10)
    {
     System.out.println("Ingrese nota");
     float nt=entrada.nextFloat();
     System.out.println(cant);
     suma=(int) (suma+nt);
     cant=cant+1;
     pro=(suma/10);
    } 
      System.out.println("la suma de las notas es de"+suma);
      System.out.println("el promedio de las notas se de:"+pro);
    }
}