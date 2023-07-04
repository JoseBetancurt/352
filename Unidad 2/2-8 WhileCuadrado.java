package whilecuadrado;

import java.util.Scanner;

public class WhileCuadrado {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        int num, cuadrado;
        
        System.out.println("Introduzca el numero: ");
        num = entrada.nextInt();
        
        while( num >= 0){
            cuadrado = num * num;
            System.out.println("el cuadrado del " + num + "es igual a" + cuadrado);
            
            System.out.println("Introduzca otro numero:");
            num = entrada.nextInt();
        }
    }
    
}
