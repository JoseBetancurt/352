/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trifiv;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author monic
 */
public class TRIFIV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // Declaracion de variables 
        int numero, mult3, mult5;
        BufferedReader bufEntrada= new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println("Ingrese un numero");
        numero= Integer.parseInt(bufEntrada.readLine());
        
        mult3= numero%3;
        mult5= numero%5;
        
    if (mult3==0 && mult5==0){
        System.out.println("TRIFIV");
    }
    else if(mult3==0){
         System.out.println("TRI");
     } 
    else if (mult5==0){
        System.out.println("FIV");
     }
 
    
     
    }
    
}
