package simple_calculator;

import java.util.Scanner;

public class simple_calc {
    public static void main(String[] args) {

        // Get user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Calc 2025");
        System.out.println();

        //Choose operation
        System.out.println("Choose and operation: add, subtract, multiply, or divide.");

        String add = sc.next();
//        String subtract = sc.next();
//        String multiply = sc.next();
//        String divide = sc.next();

        if  (add.equals("add")) {
            //Get first number
            System.out.println("Enter your first number.");
            int num1 = sc.nextInt();

            //Get second number
            System.out.println("Enter your second number.");
            int num2 = sc.nextInt();

            int sum = num1 + num2;
            System.out.println(num1 + " + " + num2 + " equals " + sum);
        }






        //Output result


    }
}
