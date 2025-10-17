//Write a program that calculates the number of full tables for a wedding event, based on the number of expected guests. Each full table will seat 10 wedding guests.
//
//Collect one integer input and assign it to the variable guests. Using integer division, calculate the total number of tables that will be filled. The variable tableSize has been declared and initialized and the variables guests and tablesFilled have been declared in the template code.
//
//Output the number of tables filled, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.
//
//If the input is:
//
//340
//
//the output is:
//
//Tables filled: 34
//
//Alternatively, if the input is:
//
//349
//
//the output is:
//
//Tables filled: 34

package WGU_projects.java_fundamentals.pa;

import java.util.Scanner;

public class pa3 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int guests;
        int tableSize = 10;
        int tablesFilled;

        System.out.print("Enter number of guests: ");
        guests = scnr.nextInt();
        tablesFilled = guests / tableSize; // integer division

        System.out.println("Tables filled: " + tablesFilled);
    }
}

