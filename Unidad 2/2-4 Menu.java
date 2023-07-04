package menu;

import java.util.Scanner;

public class MENU {
    
  static int op;
   
        public static void main(String[] args) {
                menu(op);
            }
        public static void Pgr1 (){  
            SwitchCalificacion.calificacion();
            } 
        public static void Pgr2 (){  
            SwitchDescuento.descuento();
            }
        public static void Pgr3 (){   
            SwitchCajero.cajero();
            } 
public static void menu(int op){
        
    while (op < 4)
    {
        System.out.println("1. Switch Calificaciones");
        System.out.println("2. Switch Descuento");
        System.out.println("3. Switch Cajero");
        System.out.println("4. Salir");
    
    Scanner entrada= new Scanner(System.in);
        System.out.println("Eliga una opción: ");
    op = entrada.nextInt();
    
            switch (op){
                case 1: 
                     Pgr1();
                break;
                
                case 2: 
                    Pgr2();
                break;
                
                case 3: 
                    Pgr3();
                break;
                
                case 4: 
                    System.out.println("Gracias :) ");
                    System.exit(0);
                break;
                
                default:
                    System.out.println("Opcion no valida");
        
    }
    }
  }
}