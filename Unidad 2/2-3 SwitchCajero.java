
package switchcajero;

import java.util.Scanner;


public class SwitchCajero {


    public static void main(String[] args) {
        //Variables
        final int saldo_inicial = 1000;
        int opcion;
        double ingreso = 0, saldoActual = 0, retiro = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("1. Ingresar dinero a la cuenta");
        System.out.println("2. Retirar dinero a la cuenta");
        System.out.println("3. Salir");
        
        System.out.println("Ingresar un numero:");
        opcion = entrada.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Digite la cantidad que desea ingresar: ");
                ingreso = entrada.nextDouble();
                saldoActual = saldo_inicial + ingreso;
                System.out.println("El saldo actual es:" + saldoActual);
                break;
                
            case 2:
                System.out.println("Digite la cantidad que desea retirar: ");
                ingreso = entrada.nextDouble();
                if (retiro <= saldo_inicial){
                retiro = saldo_inicial - ingreso;
                System.out.println("El saldo actual es:" + saldoActual);
                }
                else{
                    System.out.println("NO TIENE SALDO SUFICIENTE");
                }
                break;
                
            case 3:
                System.out.println("Gracias por su preferencia");
                System.exit(0);
                break;
        }
    }
    
}
