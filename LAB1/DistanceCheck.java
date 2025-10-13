/*10. Write a Java program that prompts the user to enter the center (p,q) and the radius (r) of a 
circle. Then, prompts user to enter a point (x, y) and checks whether the point is within the circle 
centered at (p, q) with radius r. */
package com.mycompany.ooplab1;
import java.util.Scanner;
public class DistanceCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the center of the circle (p q): ");
        double p = s.nextDouble();
        double q = s.nextDouble();
        System.out.print("Enter the radius(r): ");
        double r = s.nextDouble();

        System.out.print("Enter the coordinates  (x y): ");
        double x = s.nextDouble();
        double y = s.nextDouble();
        double distance = Math.sqrt(Math.pow(x - p, 2) + Math.pow(y - q, 2));

        if (distance <= r) {
            System.out.println("The point (" + x + ", " + y + ") is inside the circle.");
        } 
        else {
            System.out.println("The point (" + x + ", " + y + ") is outside the circle.");
        }

    }
}

