package simple_calculator;

import java.util.Scanner;

public class simple_calc {
    public static void main(String[] args) {

        // Get user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Calc 2025");
        System.out.println();

        //Choose operation
        System.out.println("Choose an operation: +, -, x, or /.");
        String operation = sc.nextLine();

        //Get first number
        System.out.println("Enter your first number.");
        int num1 = sc.nextInt();

        //Get second number
        System.out.println("Enter your second number.");
        int num2 = sc.nextInt();

        //Check operation, perform calculation, and output result
        //Addition
        if  (operation.equals("+")) {
            int sum = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + sum);
        }
        //Subtraction
        else if  (operation.equals("-")) {
            int difference = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + difference);
        }
        // Multiplication
        else if  (operation.equals("x")) {
            int difference = num1 * num2;
            System.out.println(num1 + " x " + num2 + " = " + difference);
        }
        //Division
        else {
            int difference = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + difference);
        }

    }
}
