package cifrasnumero;

import java.util.Scanner;


public class CifrasNumero {


public static void main(String[] args) {
        
                //Declaracion de variables
        Scanner Entrada = new Scanner(System.in);
        double numero;
        //Entrada de datos
        System.out.println("ingrese un nuemro");
        numero = Entrada.nextDouble();
        //Salida
        System.out.println(retornaEdad(numero));
        
    }
    
        public static String retornaEdad( double num){
        //Declaracion de variables 
        double n;
        
        //Procesamiento 
        n = num;
        
        //Salida de datos
        if(n >=0 && n< 10){
            return "Numero de una cifras";
        }
        
        if (n >=10 && n< 100){
            return "Numero de dos cifras";
        }
        
        if (n >= 100 && n< 1000){
            return "Numero de tres cifra";
        }
        
        if (n >= 1000 && n< 10000){
            return "Numero de cuatro cifra";
        }
        
        if (n >= 10000 && n< 100000){
            return "Numero de cinco cifra";
        }
        
            return "NO EXISTEN NUMERO MENORES A CERO";
        }
}

