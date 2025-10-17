//Write a program that collects any number of non-negative integer inputs and calculates the sum of the values. A negative integer should end the input collection and is not part of the sum.
//
//Output the smallest non-negative value and the sum of the non-negative input values, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.
//
//If the input is:
//
//15
//20
//0
//3
//-1
//
//the output is:
//
//Smallest: 0
//Sum: 38

package WGU_projects.java_fundamentals.pa;

import java.util.Scanner;

public class pa7 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int sum = 0;
        Integer smallest = null; // Use Integer to handle the first comparison safely

        while (true) {
            System.out.print("Enter number: ");
            int num = scnr.nextInt();

            if (num < 0) { // Stop collecting input when a negative number is entered
                break;
            }

            sum += num;

            if (smallest == null || num < smallest) {
                smallest = num;
            }
        }

        // Handle the case where no non-negative numbers were entered
        if (smallest == null) {
            System.out.println("No non-negative numbers were entered.");
        } else {
            System.out.println("Smallest: " + smallest);
            System.out.println("Sum: " + sum);
        }

        scnr.close();
    }
}

