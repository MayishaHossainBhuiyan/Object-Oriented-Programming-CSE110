/*06: Write a program that reads an integer from the console and determines whether the given 
number is divisible by either 2 or 3 (but not both). Then the program should print TRUE, 
otherwise, the program should print FALSE. */
package com.mycompany.ooplab1;
import java.util.Scanner;
public class DivisableOrNot {
    public static void main(String[]args){
        Scanner s =new Scanner(System.in);
        System.out.print("Input the number: ");
         int number = s.nextInt();
          if ((number % 2 == 0 && number % 3 != 0)||(number % 3 == 0 && number % 2 != 0)) {
            System.out.println("TRUE");
          }
        else {
            System.out.println("FALSE");
        }
    } 
 }
    
