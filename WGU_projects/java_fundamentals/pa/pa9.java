//Define a method named "showResults" with one parameter. The parameter should reference a random object rand. The showResults() method should generate a random integer of 0 or 1 using the random object reference rand. If the random number generated is equal to 1, return "true". If the random number generated is equal to 0, return "false".
//
//In the main() method template, the rand variable has already been assigned a random object with a seed value of 2. Write a program that collects one integer value as input, assumed to be greater than 0. Use a loop to call the showResults() method a number of times equal to the integer input. e.g., If 3 is entered as input, then showResults() will be called 3 times, each time returning "true" or "false".
//
//Output the returned Boolean values on separate lines, ending with a newline.
//
//If the input is:
//
//3
//
//the output with a random object seed value of 2 is:
//
//true
//false
//true

package WGU_projects.java_fundamentals.pa;

import java.util.Random;
import java.util.Scanner;

public class pa9 {

    // Define the showResults() method
    public static String showResults(Random rand) {
        int num = rand.nextInt(2); // generates 0 or 1
        if (num == 1) {
            return "true";
        } else {
            return "false";
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int inputVal = scnr.nextInt();  // read user input
        Random rand = new Random(2);    // random object with seed 2

        // Loop inputVal times, calling showResults()
        for (int i = 0; i < inputVal; i++) {
            System.out.println(showResults(rand));
        }
    }
}

