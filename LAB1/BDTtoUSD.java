/*09: Write a Java program that prompts the user to enter the exchange rate from currency in U.S. 
dollars (USD) to Bangladeshi Taka (BDT). Prompt the user to enter 0 to convert from USD to 
BDT and 1 to convert from BDT to USD.Then, prompt the user to enter the amount in USD or in 
BDT to convert it to BDT or USD, respectively. */
package com.mycompany.ooplab1;
import java.util.Scanner;
public class BDTtoUSD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the exchange rate from USD to BDT: ");
        double rate = s.nextDouble();
        System.out.print("Enter 0 to convert USD to BDT or 1 to convert BDT to USD: ");
        int choice = s.nextInt();

          switch (choice) {
            case 0:
                System.out.print("Enter the amount in USD: ");
                double usd = s.nextDouble();
                double bdtFromUsd = usd * rate;
                System.out.printf("$%.2f USD = %.2f BDT%n", usd, bdtFromUsd);
                break;

            case 1:
                System.out.print("Enter the amount in BDT: ");
                double bdt = s.nextDouble();
                double usdFromBdt = bdt / rate;
                System.out.printf("%.2f BDT = $%.2f USD%n", bdt, usdFromBdt);
                break;

            default:
                System.out.println("Invalid input! Please enter 0 or 1 only.");
                break;
        }
    }
}


