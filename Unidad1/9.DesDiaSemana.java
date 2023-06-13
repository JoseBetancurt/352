
package com.mycompany.diasdelasemana;

import java.util.Scanner;




public class DiasDeLaSemana {
public static int N;
public static double Dinero;
public static String fecha;

    public static void main(String[] args) {
    Pedir();
    IF();        
  } 
    public static void  Pedir ()
    {
    // Montos
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ingresa el monto");
     N = Entrada.nextInt();
     // Fecha
        System.out.println("Ingresa dia de la semana");
        Scanner sc = new Scanner(System.in);
      fecha = sc.nextLine();
    }
    
    public static void IF()
            
    {
        if ("martes".equals(fecha) ||"jueves".equals(fecha) )
 {
   Dinero=(N*0.15);
        System.out.println("Tienes descuento de " + Dinero);
   Dinero=(N-Dinero);
        System.out.println("El total de tu compra es " + Dinero);
 }
    }

        
}
