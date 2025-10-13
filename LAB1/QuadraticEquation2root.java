
//08: The two roots of a quadratic equation ax2+ bx + c = 0 
package com.mycompany.ooplab1;
import java.util.Scanner;
public class QuadraticEquation2root {
       public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = s.nextDouble();
        System.out.print("Enter b: ");
        double b = s.nextDouble();
        System.out.print("Enter c: ");
        double c = s.nextDouble();
        
        double  discriminant, root1, root2;
        discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("This equation has two real roots:");
            System.out.printf("Root 1 = %.2f%n", root1);
            System.out.printf("Root 2 = %.2f%n", root2);
        } else if (discriminant == 0) {
            root1 = -b / (2 * a);
            System.out.println("This equation has one real root:");
            System.out.printf("Root = %.2f%n", root1);
        } else {
            System.out.println("This equation has no real roots.");
        }
    }
}
