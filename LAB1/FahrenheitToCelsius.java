
/*04: Write a program that converts a Fahrenheit degree to Celsius using the formula: 
celsius = (5.0 / 9) * (fahrenheit – 32) */
package com.mycompany.ooplab1;
import java.util.Scanner;
public class FahrenheitToCelsius {
       public static void main (String[]args){
       Scanner s =new Scanner(System.in);
         System.out.print( "Enter the fahrenheit value: ");
         double fahrenheit = s.nextDouble();
         double celsius =(5.0/9)*(fahrenheit-32);
          System.out.print(fahrenheit+"is equal to " +celsius + " celsius"); 
    }
}
