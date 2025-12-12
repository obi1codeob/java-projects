package java_fundamentals_pa_questions;

import java.util.Scanner;

public class q7_smallest_and_sum {
    public static void main (String[] args) {

        Scanner scnr = new Scanner(System.in);

        //Declare variables for smallest and sum;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;

        //While input numbers are not negative continue to get number input from user and add to sum
        while (true) {
            System.out.println("Enter a number: ");
            int num_input = scnr.nextInt();

            //If number input is negative, stop collecting input
            if (num_input < 0) {
                break;
            }

            //Add num input to sum
            sum += num_input;

            //Determine if input number is smallest and if so, make it the smallest numbers
            if (num_input < smallest) {
                smallest = num_input;
            }

        }
        //Output formatted message with smallest number and sum of positive input numbers
        System.out.println("Smallest: " + smallest);
        System.out.println("Sum: " + sum);
    }
}
