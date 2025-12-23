//**** Basic Calculator ****

//Import scanner module so user input can be collected
import java.util.Scanner;

//Creat java class for calculator program
public class basic_calculator {
    //Create main area for program to run
    public static void main(String[] args) {

        //Create scanner for user input
        Scanner scnr = new Scanner(System.in);

        //Intro to calculator program
        System.out.println("Welcome to John's Calculator 2025 version 1.0!");
        System.out.println("Step 1: Enter operation type.");
        System.out.println("Step 2: Enter numbers to calculate.");

        //Ask user for operation (add, subtract, multiple, or divide)
        System.out.println("What math calculation do you want to do? +, -, x, or / : ");
        String userOperation = scnr.next();

        //Ask user for first number
        System.out.println("Enter the first number: ");
        double sum = scnr.nextDouble();

        while (true) {
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
