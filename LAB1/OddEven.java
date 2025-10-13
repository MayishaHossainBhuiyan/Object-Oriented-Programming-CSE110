/*5: Write a java program that reads an integer, and prints “The number is even” or “The number 
is odd”, depending on whether the number is even or odd. */
package com.mycompany.ooplab1;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        int number;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        number = s.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } 
        else {
            System.out.println("The number is odd.");
        }
    }
}

