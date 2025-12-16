package java_fundamentals_pa_questions;

import java.util.Scanner;

public class q8_arrays {
    public static void main (String[] args) {

        Scanner scnr = new Scanner(System.in);

        //Create an array that can hold three double values
        double[] values = new double[3];

        //Loop three times, get a double from input each time and store in an array
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a double number.");
            values[i] = scnr.nextDouble();
        }

        //Calculate the sum of the doubles
        double sum = 0.0;
        for (double value: values) {
            sum+= value;
        }

        //Calculate the average of the doubles
        double average = sum / 3.0;

        //Output the array items
        //Output formatted heading
        System.out.println("Array items: ");

        //Loop through the array and output each number
        for (int i = 0; i < 3; i++) {
            System.out.print(values[i]);
            //Add a comma between the numbers
            if (i < 2) {
                System.out.print(", ");
            }
        }
        //Output a blank line
        System.out.println();

        //Output formatted heading for average as well as average
        System.out.println("Average: " + average);
    }
    }
