//Write a program that collects two integer inputs and assigns them to the variables starting_num and multiplier. Multiply starting_num by multiplier and output the result. Repeat this process two more times, each time multiplying the previous result by multiplier. The three product outputs should be separated by a whitespace character, ending with a newline.
//
//If the input is:
//
//2
//5
//
//the output when starting_num = 2 is:
//
//10 50 250

package WGU_projects.java_fundamentals.pa;

import java.util.Scanner;

public class pa2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int starting_num = scnr.nextInt();
        System.out.print("Enter a number: ");
        int multiplier = scnr.nextInt();

        // Perform the first multiplication
        int result1 = starting_num * multiplier;
        System.out.print(result1 + " ");

        // Perform the second multiplication
        int result2 = result1 * multiplier;
        System.out.print(result2 + " ");

        // Perform the third multiplication
        int result3 = result2 * multiplier;
        System.out.println(result3);

        scnr.close();
    }
}

