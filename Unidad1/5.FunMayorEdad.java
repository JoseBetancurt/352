
package mayordeedad;

import java.util.Scanner;


public class MayorDeEdad {


    public static void main(String[] args) {
        
                //Declaracion de variables
        Scanner Entrada = new Scanner(System.in);
        int edad;
        //Entrada de datos
        System.out.println("Dame una edad: ");
        edad = Entrada.nextInt();
        //Salida de datos
        System.out.println(retornaEdad(edad));
        
    }
    
        public static String retornaEdad( int eda){
        //Declaracion de variables 
        int ed;
        
        //Procesamiento de datos
        ed = eda;
        
        //Salida de datos
        if(ed >= 18){
            return "Mayor de edad";
        }
        
            return "Menor de edad";
        }
}
