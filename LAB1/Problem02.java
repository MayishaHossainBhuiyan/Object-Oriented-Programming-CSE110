/*02: Write a program that prompts the user to enter the seconds, and display the hours, minutes 
and seconds for the input seconds. */
package com.mycompany.ooplab1;
import java.util.Scanner;
public class Problem02 {
    public static void main(String[] agrs){
        int InputInSecond, hours,minutes,seconds;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the second: ");
        InputInSecond = s.nextInt();
        hours = InputInSecond/3600;
        minutes= (InputInSecond % 3600)/60;
        seconds = InputInSecond %60;
        System.out.println("The time is: " + hours + " hours " + minutes + " minutes " + seconds + " seconds.");
    }
}

