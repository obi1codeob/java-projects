//Project: Wedding Tables

/* Objective: Write a program that calculates the number of full tables for a wedding event, based on the number of expected guests.

Each full table will seat 10 wedding guests

Collect one integer input and assign it to the variable "guests:.

Using integer division, calculate the total number of tables that will be filled.

Output the number of tables filled, ending with a newline. Ensure the program output matches the formatting below and works for a variety of input values

If the input is:

340

The output is:

Tables filled: 34

If the input is:

349

The output is:

Tables filled: 34
 */


package wguJavaFundamentals;

//Import scanner utility to get user input
import java.util.Scanner;

public class q3WeddingTables {
    public static void main(String[] args) {

    //Create new scanner
    Scanner sc = new Scanner(System.in);

    //Declare variables
    int guests;
    int tableSize = 10;
    int tablesFilled;
    int tablesNeeded;

    //Get number of guests from user input
    System.out.println("How many guests are expected to attend the wedding?");
    guests = sc.nextInt();

    //Calculate how many filled tables there will be based on the number of guests
    tablesFilled = guests / tableSize;

    //Output the number of filled tables
    System.out.println("Tables filled: " + tablesFilled);

    //Calculate how many actual tables are needed to seat all guests
    tablesNeeded = (guests + tableSize - 1) / tableSize;
    System.out.println("Tables Needed to Seat All Guests: " + tablesNeeded);

    }
}

