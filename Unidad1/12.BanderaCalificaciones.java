package banderacalificaciones;

import java.util.Scanner;

public class BanderaCalificaciones {

    static int ca1, ca2, ca3, ca4, ca5;
    
    public static void main(String[] args) {
        pedirCalificaciones();
        calificacionReprobada(ca1, ca2, ca3, ca4, ca5);
    }
    
    public static void pedirCalificaciones() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Calificación 1:");
        ca1 = entrada.nextInt();
        
        System.out.println("Calificación 2:");
        ca2 = entrada.nextInt();
        
        System.out.println("Calificación 3:");
        ca3 = entrada.nextInt();
        
        System.out.println("Calificación 4:");
        ca4 = entrada.nextInt();
        
        System.out.println("Calificación 5:");
        ca5 = entrada.nextInt();
    }
    
    public static void calificacionReprobada(int c1, int c2, int c3, int c4, int c5) {
        boolean bandera1;
        boolean bandera2;
        boolean bandera3;
        boolean bandera4;
        boolean bandera5;
        
        bandera1 = (c1 <= 5);
        System.out.println("Reprobatoria: " + bandera1);
        
        bandera2 = (c2 <= 5);
        System.out.println("Reprobatoria: " + bandera2);
        
        bandera3 = (c3 <= 5);
        System.out.println("Reprobatoria: " + bandera3);
        
        bandera4 = (c4 <= 5);
        System.out.println("Reprobatoria: " + bandera4);
        
        bandera5 = (c5 <= 5);
        System.out.println("Reprobatoria: " + bandera5);
    }
  }