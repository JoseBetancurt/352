package pkg2.pkg1.switchcalificacion;

import java.util.Scanner;

public class SwitchDescuento {

    public static void main(String[] args) {
        double PV = 1000;
        Scanner entrada = new Scanner(System.in); 
        int descuento = 0;
        double precioFinal;
        String codPromocion = null; 
        
        System.out.println("Su total de compra es: $ " + PV );
        System.out.println("Tienes un codigo de descuento escribelo:");
        codPromocion = entrada.next();
        codPromocion = codPromocion.toUpperCase();
        
        
        switch(codPromocion){
            case "PLATINOOCTUBRE":
                    descuento = 20;
                    break;
                    
            case "SILVEROCTUBRE":
                    descuento = 50;
                    break;
                    
            case "OROOCTUBRE":
                    descuento = 35;
                    break;
                    
            default:
                System.out.println("Ha introducido un codigo no existente");
        }
        precioFinal = PV - descuento;
        System.out.println("Total sobre descuento es: $" + precioFinal);
    }
    
}
