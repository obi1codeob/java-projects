//Write a program that takes a full name, age, and salary as inputs on separate lines. Output a formatted message containing the inputs, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.
//
//If the input is:
//
//Pat Ford
//35
//60,000
//
//the output is:
//
//Pat Ford is 35 and makes $60,000.

package WGU_projects.java_fundamentals.pa;

import java.util.Scanner;

public class pa4 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Read input values
        System.out.print("Enter your given name: ");
        String fullName = scnr.nextLine();
        System.out.print("Enter your age: ");
        String age = scnr.nextLine();
        System.out.print("Enter your salary: ");
        String salary = scnr.nextLine();

        // Output formatted message
        System.out.println(fullName + " is " + age + " and makes $" + salary + ".");
    }
}