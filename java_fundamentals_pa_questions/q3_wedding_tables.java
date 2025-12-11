package java_fundamentals_pa_questions;

import java.util.Scanner;

public class q3_wedding_tables {
    public static void main (String[] args) {

        //Create scanner
        Scanner scnr = new Scanner(System.in);

        //Starting variables
        int tableSize = 10;
        int tablesFilled = 0;
        int guests;

        //Welcome message
        System.out.println("**************************************");
        System.out.println("Welcome to Wedding Table Calculator!");
        System.out.println("**************************************");
        System.out.println("Given a number of guests you expect at your wedding, I can help you determine how many tables your guests will fill. \n");
        System.out.println("* Wedding tables seat 10 people each. \n");

        System.out.println("How many guests?: \n");
        guests = scnr.nextInt();

        tablesFilled = guests / tableSize;

        //Output formatted message with number of tables filled by guests
        System.out.println("Your " + guests + " wedding guests will fill " + tablesFilled + " tables. ");
    }
}
