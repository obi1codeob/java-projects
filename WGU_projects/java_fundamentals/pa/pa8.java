//Write a program that creates an array to hold three values of type double. The program should collect the three double values as input and store them in the array. Then calculate the average value of the array.
//
//Output the array values and calculated average value, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.
//
//If the input is:
//
//10.0
//10.5
//11.0
//
//the output is:
//
//Array items: 10.0, 10.5, 11.0
//Average: 10.5

package WGU_projects.java_fundamentals.pa;

import java.util.Scanner;

public class pa8 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double[] values = new double[3];
        double sum = 0.0;

        // Collect 3 double values from user input
        for (int i = 0; i < values.length; i++) {
            System.out.print("Enter a double value: ");
            values[i] = scnr.nextDouble();
            sum += values[i];
        }

        // Calculate the average
        double average = sum / values.length;

        // Output the array items
        System.out.printf("Array items: %.1f, %.1f, %.1f%n", values[0], values[1], values[2]);

        // Output the average
        System.out.printf("Average: %.1f%n", average);
    }
}

