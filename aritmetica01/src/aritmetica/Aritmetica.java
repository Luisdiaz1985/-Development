/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

/**
 *
 * @author  luis dias
 */
public class Aritmetica {
    
    

     public static void main(String[] args) {
    double suma;
     double  resta;
     double division=0;
     double multiplicasion;
     double num=6;
     double num2=8;
      suma= num + num2;
      resta= num - num2;
      multiplicasion = num * num2;
      //no dividir entre denominador 
     if (num2 !=0){
       division = num/num2;  
     } 
    
    //impresion de los valores 
        System.out.println("el resulatdo de la suuma es :" + suma);
        System.out.println("el resulatdo de la resta es :" + resta);
        System.out.println("el resulatdo de la division es :" + division);
        System.out.println("el resulatdo de la multipicasion es :" + multiplicasion);
     }     
}  



