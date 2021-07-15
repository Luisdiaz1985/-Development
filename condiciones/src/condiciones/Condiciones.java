/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condiciones;

/**
 *
 * @author Raul Fonseca
 */
public class Condiciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
    
         int M = 6, T = 1, K = -10;
         int R2;
         int R3;
         double R;
          R = T/K ;
          R2= M+T;
          R3= M-T;
     
     if ( M > T){
         System.out.println("6>1 es mayor " + M);
         
     }
     else {
         System.out.println("6>1 es menor " + T);
     }
        
     if ( R == -5){
         System.out.println("1/-10=-5 es verdadero " + R);
         
     }
     else {
         System.out.println("1/-10= -5 falso "   + R);
     }
     if ( M > T){
         
     }
         if (R2==7 || R3==5){
             System.out.println("6+1=7  6-1=5 Es verdadera " );
              
         }
         
    // realizado por luis diaz yanez
    }
    
}
