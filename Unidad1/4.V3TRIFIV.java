
package pkg4.v3trifiv;

import java.util.Scanner;


public class V3TRIFIV {


    public static void main(String[] args) {
        
        //Declaracion de variables
        Scanner Entrada = new Scanner(System.in);
        int numero;
        //Entrada de datos
        System.out.println("Dame un numero: ");
        numero = Entrada.nextInt();
        //Salida de datos
        System.out.println(retornaMultiplo(numero));
    }
    
    public static String retornaMultiplo( int num){
        //Declaracion de variables 
        int mult3, mult5;
        
        //Procesamiento de datos
        mult3 = num % 3;
        mult5 = num % 5;
        
        //Salida de datos
        if(mult3 == 0 && mult5 == 0){
            return "TRIFIV";
        }
        
        else if (mult3==0){
            return "TRI";
        }
        
        else if (mult5==0){
            return "FIV";
        }
        
            return "Ningun caso";
        
        
    }
    
}