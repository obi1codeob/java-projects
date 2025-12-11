package java_fundamentals_pa_questions;

import java.util.Scanner;

public class q2_integer_multiplication {
    public static void main (String[] args) {

        Scanner scnr =  new Scanner(System.in);

        //Welcome message
        System.out.println("Welcome to the Multiplier!\n");

        System.out.println("Enter a number to start with: \n");
        int starting_num = scnr.nextInt();

        System.out.println("Enter a number to multiply your initial number by: \n");
        int multiplier = scnr.nextInt();

        //Output product
        int product = starting_num * multiplier;
        System.out.println(product);

        //Output product two more times
        product = product * multiplier;
        System.out.println(product);

        product = product * multiplier;
        System.out.println(product);


    }
}
