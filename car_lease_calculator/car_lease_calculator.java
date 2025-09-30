package car_lease_calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class car_lease_calculator {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Car Lease Calculator!");
        System.out.println();
        System.out.println("Answer the following questions and Car Lease Calculator will determine your total cost of leasing the car your chose.");
        System.out.println();

        System.out.println("Enter the down payment amount.");
        int downPayment = sc.nextInt();

        System.out.println("Enter the monthly payment amount.");
        int paymentPerMonth = sc.nextInt();

        System.out.println("Enter the number of months in the lease.");
        int numMonths = sc.nextInt();
        System.out.println();

        double totalCost = downPayment + (paymentPerMonth * numMonths);

        DecimalFormat formatter = new DecimalFormat("$#,###");

        System.out.print("Your total cost of the car lease is: ");
        System.out.println(formatter.format(totalCost));

    }
}
