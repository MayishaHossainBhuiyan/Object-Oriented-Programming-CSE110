/*01: Write a program to compute the area of a circle and use the final keyword to specify the 
value of PI. */
package com.mycompany.ooplab1;
import java.util.Scanner;
public class Problem01CircleArea {
    public static void main(String[] args) {
        final double PI = 3.14159; 
        double radius, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = s.nextDouble();
        area = PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }
}
