package simple_calculator;

import java.util.Scanner;

public class simple_calc {
    public static void main(String[] args) {

        // Get user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Calc 2025");
        System.out.println();

        //Choose operation
        System.out.println("Choose an operation: add, subtract, multiply, or divide.");
        String operation = sc.nextLine();

        //Get first number
        System.out.println("Enter your first number.");
        int num1 = sc.nextInt();

        //Get second number
        System.out.println("Enter your second number.");
        int num2 = sc.nextInt();

        //Check operation, perform calculation, and output result
        if  (operation.equals("add")) {
            int sum = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + sum);
        }

        if  (operation.equals("subtract")) {

            int difference = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + difference);
        }

        if  (operation.equals("multiply")) {

            int difference = num1 * num2;
            System.out.println(num1 + " x " + num2 + " = " + difference);
        }

        if  (operation.equals("divide")) {

            int difference = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + difference);
        }

    }
}
