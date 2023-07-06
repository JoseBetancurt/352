package edadesyalturas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EdadesYAlturas {

    public static void main(String[] args) {
        
    //Inicializar variables
    
        Scanner entrada= new Scanner(System.in);
        
            int edad;
            int media_edad;
            int suma_edad;
            int mayor_edad;
            int meyor_175;
            
            double altura;
            double media_altura;
            double suma_altura;
            
    //Iniciar variables
    
        mayor_edad=0;
        media_altura=0;
            int mayor_175 = 0; 
        suma_edad=0;
        suma_altura=0;
        
    //Proceso
    
            for (int i=1; i <= 5; i++){
                System.out.println("***");
                System.out.println("* Alumno No."+ i +"     *");
                System.out.println("+ Introduzca la edad:     *");
                    edad=entrada.nextInt();
                System.out.println("*Introduzca la altura:   *");
                    altura = entrada.nextDouble();
            if(edad >=18){
                mayor_edad++;
            }
            
            if(altura>1.75){
                mayor_175++;
            }
                suma_edad=suma_edad+edad;
                suma_altura=suma_altura+altura;
            }
    //Termina ciclo For
    
                media_edad=suma_edad/5;
                media_altura=suma_altura/5;
                
    //Salida de Datos
       
                DecimalFormat df = new DecimalFormat("#.00");
       
                System.out.println("* La edad media es de:   " + df.format(media_edad));
                System.out.println("* La altura media es de:  " + df.format(media_altura));
                System.out.println("* Cantidad > 18: " + df.format(mayor_175));
                System.out.println("* Cantidad > 1.75: " + df.format(mayor_175));
    }
    
}