
package determinaretapas;

import java.util.Scanner;


public class DeterminarEtapas {

    int e=0;    
    
    public static void main(String[] args) {
        
                //Declaracion de variables
        Scanner Entrada = new Scanner(System.in);
        int edad;
        //Entrada de datos
        System.out.println("Ingrese la edad");
        edad = Entrada.nextInt();
        //Salida
        System.out.println(retornaEdad(edad));
        
    }
    
        public static String retornaEdad( int num){
        //Declaracion de variables 
        int e;
        
        //Procesamiento 
        e = num;
        
        //Salida de datos
        if(e >=0 && e<= 5){
            return "Infante";
        }
        
        if (e >=6 &&  e<= 17){
            return "Niño";
        }
        
        if (e >= 18){
            return "Adulto";
        
        }
        
            return "NO EXISTEN EDADES MENORES A CERO";
        }
}

