package temperatura;

import java.util.Scanner;


public class Temperatura {


public static void main(String[] args) {
        
                //Declaracion de variables
        Scanner Entrada = new Scanner(System.in);
        double temperatura;
        //Entrada de datos
        System.out.println("Ingrese la temperatura en C°");
        temperatura = Entrada.nextDouble();
        //Salida
        System.out.println(retornaEdad(temperatura));
        
    }
    
        public static String retornaEdad( double tem){
        //Declaracion de variables 
        double t;
        
        //Procesamiento 
        t = tem;
        
        //Salida de datos
        if(t <= 10){
            return "Frio";
        }
        
        if (t > 10 && t <= 20){
            return "Nublado";
        }
        
        if (t > 20 && t <= 30){
            return "Caluroso";
        }
        
            return "Tropical";
        }
}

