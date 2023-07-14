package sueldos;

import java.util.Scanner;

public class Sueldos {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        double Sueldo;
        double SSueldo;
        double MSueldo;
        double PSueldo;
        double SueldoMax;
        double SueldoMin;
        
        Sueldo = 0;
        SSueldo = 0;
        MSueldo = 0;
        PSueldo = 0;
        SueldoMax = 0;
        SueldoMin =999999999;
            
            for (int i=1; i <= 10; i++){
                System.out.println("***************************");
                System.out.println("* Sueldo No."+ i +"       *");
                System.out.println("+ Introduzca el sueldo:   *");
                    Sueldo = entrada.nextDouble();
     
                    
                PSueldo = PSueldo + Sueldo / 10;
                
                SSueldo = SSueldo + Sueldo;
                    
                if(Sueldo > 1000){
                    MSueldo++;
                }
                
                if(Sueldo > SueldoMax){
                    SueldoMax = Sueldo;
                }
                
                if(Sueldo < SueldoMin){
                    SueldoMin = Sueldo;
                }
                

                
            }
                  System.out.println("La suma de los sueldo es: " + SSueldo);
                  System.out.println("Sueldos mayores a 1000 son: " + MSueldo);
                  System.out.println("El promedio de sueldos es: " + PSueldo);
                  System.out.println("El sueldo maximo es: " + SueldoMax);
                  System.out.println("El sueldo minimo es: " + SueldoMin);
    }
        
    }