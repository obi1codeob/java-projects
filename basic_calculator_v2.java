//*** Basic Calculator v2: Allows for multiple operations ***

//Import scanner module so user input can be collected
import java.util.Scanner;

//Creat java class for calculator program
public class basic_calculator_v2 {
    //Create main area for program to run
    public static void main(String[] args) {

        //Create scanner for user input
        Scanner scnr = new Scanner(System.in);

        //Intro to calculator program
        System.out.println("Welcome to John's Calculator 2025 version 2.0!");
        System.out.println("In this version you can use multiple operations in your calculation.");
        System.out.println();
        System.out.println("STEPS:");
        System.out.println("Step 1: Enter first number.");
        System.out.println("Step 2: Enter operation.");
        System.out.println("Step 3: Enter next number.");
        System.out.println("Step 4: Enter operation.");
        System.out.println("Step 5: Repeat steps 3 and 4.");
        System.out.println();

        //Ask user for first number
        System.out.println("Enter the first number: ");
        double sum = scnr.nextDouble();

        while (true) {
            //Ask user for operation (add, subtract, multiple, or divide)
            System.out.println("What math calculation do you want to do? +, -, x, or / : ");
            String userOperation = scnr.next();

            //Addition
            if (userOperation.equals("+")) {
                System.out.println("Enter next number: ");
                double userNum = scnr.nextDouble();
                sum += userNum;
                System.out.printf("%.2f\n", sum);
            }
            //Subtraction
            if (userOperation.equals("-")) {
                System.out.println("Enter next number: ");
                double userNum = scnr.nextDouble();
                sum -= userNum;
                System.out.printf("%.2f\n", sum);
            }
            //Multiplication
            if (userOperation.equals("*")) {
                System.out.println("Enter next number: ");
                double userNum = scnr.nextDouble();
                sum *= userNum;
                System.out.printf("%.2f\n", sum);
            }
            //Division
            if (userOperation.equals("/")) {
                System.out.println("Enter next number: ");
                double userNum = scnr.nextDouble();
                sum /= userNum;
                System.out.printf("%.2f\n", sum);
            }

            scnr.close();

        }
    }
}
