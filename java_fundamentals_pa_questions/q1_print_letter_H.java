//*** Java Fundamentals PA Question 1 Expanded ***

//Directory where java program is located
package java_fundamentals_pa_questions;

//Import scanner utility so user input can be collected
import java.util.Scanner;

public class q1_print_letter_H {
    public static void main (String[] args) {

        //Create a scanner to get user input
        Scanner scnr = new Scanner(System.in);

        //Welcome message
        System.out.println("Welcome to Letter Painter, where you give me a letter and I will draw it using the letter.");

        //Get a letter of the alphabet from the user and make it capital
        System.out.println("Enter a letter of the English alphabet: ");
        String ltr = scnr.nextLine().toUpperCase();

        //Using the capital letter, output the provided pattern using formatted output

        System.out.println(ltr + "   " + ltr);
        System.out.println(ltr + "   " + ltr);
        System.out.println(ltr + ltr + ltr + ltr + ltr);
        System.out.println(ltr + "   " + ltr);
        System.out.println(ltr + "   " + ltr);


    }
}
