package forfactorial;

import java.util.Scanner;

public class ForFactorial {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        double factorial;
        int num;
        System.out.println("Introduce un numero: ");
        num = entrada.nextInt();
        factorial = 1;
        for (int i = num; i > 0; i--){
            factorial = factorial * i;
        }
        
        System.out.println("El factorial de: " + num + "es: " + factorial);
        
    }
    
}
