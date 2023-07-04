package pkg2.pkg1.switchcalificacion;

import java.util.Scanner;

public class SwitchCalificacion {

    public static void main(String[] args) {
    int calificacion;
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Introduzca calificacion: ");
    calificacion = entrada.nextInt();
    
    
    switch (calificacion){
        
        case 0:
            System.out.println("MUY MAL");
            break;
            
        case 1:
        case 2:    
        case 3:
        case 4:    
        case 5:
            System.out.println("INSUFICIENTE");
            break;
            
        case 6:
            System.out.println("SUFICIENTE");
            break;
            
        case 7:
        case 8:
            System.out.println("BIEN");
            break;
            
        case 9:
            System.out.println("NOTABLE");
            break;
            
        case 10:
            System.out.println("SOBRESALIENTE");
            break;
        
        default:
            System.out.println("ERROR DE CALIFICACION");
            break;
            
    }
    
}
}