//*** Java Fundamentals PA Question 1 Expanded: Make ASCII words from letters ***

//Directory where java program is located
package java_fundamentals_pa_questions;

//Import scanner utility so user input can be collected
import java.util.Scanner;

public class q1_expanded_ascii_words {
    public static void main (String[] args) {

        //Create a scanner to get user input
        Scanner scnr = new Scanner(System.in);

        //Welcome message
        System.out.println("Welcome to Word Painter, where you give me letters and I will draw an ASCII version of a four letter word.");

        //Get a letter of the alphabet from the user
        System.out.println("Enter a letter of the English alphabet: ");
        String ltr = scnr.nextLine().toUpperCase();

        System.out.println("I will use this letter to draw your word using ASCII art.");

        //Get the first letter of the word
        System.out.println("Enter the first letter of your four-letter word: ");
        String first_ltr = scnr.nextLine().toUpperCase();

        //Create switch case for all letter of the alphabet
        switch (ltr) {
            case "A": {
                //Using the capital letter, output the letter pattern using formatted output
                System.out.println(ltr + ltr + ltr + ltr + ltr);
                System.out.println(ltr + "   " + ltr);
                System.out.println(ltr + ltr + ltr + ltr + ltr);
                System.out.println(ltr + "   " + ltr);
                System.out.println(ltr + "   " + ltr);
                break;
            }

            case "B": {
                System.out.println(ltr + ltr + ltr + ltr + ltr);
                System.out.println(ltr + "  " + ltr);
                System.out.println(ltr + ltr + ltr + ltr + ltr);
                System.out.println(ltr + "  " + ltr);
                System.out.println(ltr + ltr + ltr + ltr + ltr);
                break;
            }

            case "C": {
                System.out.println(ltr + ltr + ltr + ltr + ltr);
                System.out.println(ltr);
                System.out.println(ltr);
                System.out.println(ltr);
                System.out.println(ltr + ltr + ltr + ltr + ltr);
                break;
            }

            case "D": {
                System.out.println(ltr + ltr + ltr + ltr);
                System.out.println(ltr + "   " + ltr);
                System.out.println(ltr + "   " + ltr);
                System.out.println(ltr + "   " + ltr);
                System.out.println(ltr + ltr + ltr + ltr);
                break;
            }

            case "E": {
                System.out.println(ltr + ltr + ltr + ltr + ltr);
                System.out.println(ltr);
                System.out.println(ltr + ltr + ltr + ltr + ltr);
                System.out.println(ltr);
                System.out.println(ltr + ltr + ltr + ltr + ltr);
                break;
            }

            case "F": {
                System.out.println(ltr + ltr + ltr + ltr + ltr);
                System.out.println(ltr);
                System.out.println(ltr + ltr + ltr + ltr);
                System.out.println(ltr);
                System.out.println(ltr);
                break;
            }

            case "G": {
                System.out.println(ltr + ltr + ltr + ltr + ltr);
                System.out.println(ltr);
                System.out.println(ltr + "  " + ltr + ltr);
                System.out.println(ltr + "   " + ltr);
                System.out.println(ltr + ltr + ltr + ltr + ltr);
                break;
            }

            case "H": {
                System.out.println(ltr + "   " + ltr);
                System.out.println(ltr + "   " + ltr);
                System.out.println(ltr + ltr + ltr + ltr + ltr);
                System.out.println(ltr + "   " + ltr);
                System.out.println(ltr + "   " + ltr);
                break;
            }

            case "I": {
                System.out.println(ltr + ltr + ltr + ltr + ltr);
                System.out.println("  " + ltr + "  ");
                System.out.println("  " + ltr + "  ");
                System.out.println("  " + ltr + "  ");
                System.out.println(ltr + ltr + ltr + ltr + ltr);
                break;
            }

            case "J": {
                System.out.println(ltr + ltr + ltr + ltr + ltr + ltr + ltr);
                System.out.println("   " + ltr);
                System.out.println("   " + ltr);
                System.out.println(ltr + "  " + ltr);
                System.out.println(ltr + ltr + ltr + ltr);
                break;
            }

            case "K": {
                System.out.println(ltr + "    " + ltr);
                System.out.println(ltr + "  " + ltr);
                System.out.println(ltr + " " + ltr);
                System.out.println(ltr + "   " + ltr);
                System.out.println(ltr + "    " + ltr);
                break;
            }

            case "L": {
                System.out.println(ltr);
                System.out.println(ltr);
                System.out.println(ltr);
                System.out.println(ltr);
                System.out.println(ltr + ltr+ ltr +ltr +ltr);
                break;
            }

            case "M": {
                System.out.println(ltr + ltr + ltr + ltr + ltr + ltr + ltr);
                System.out.println(ltr + "  " + ltr + "  " + ltr);
                System.out.println(ltr + "  " + ltr + "  " + ltr);
                System.out.println(ltr + "     " + ltr);
                System.out.println(ltr + "     " + ltr);
                break;
            }

            case "N": {
                System.out.println(ltr + ltr + ltr + ltr + ltr + ltr + ltr);
                System.out.println(ltr + "     " + ltr);
                System.out.println(ltr + "     " + ltr);
                System.out.println(ltr + "     " + ltr);
                System.out.println(ltr + "     " + ltr);
                break;
            }

            case "O": {
                System.out.println(ltr + ltr+ ltr +ltr +ltr);
                System.out.println(ltr + "   " + ltr);
                System.out.println(ltr + "   " + ltr);
                System.out.println(ltr + "   " + ltr);
                System.out.println(ltr + ltr+ ltr +ltr +ltr);
                break;
            }

            case "P": {
                System.out.println(ltr + ltr+ ltr +ltr +ltr);
                System.out.println(ltr + "   " + ltr);
                System.out.println(ltr + ltr+ ltr +ltr +ltr);
                System.out.println(ltr);
                System.out.println(ltr);
                break;
            }

            case "Q": {
                System.out.println(ltr + ltr+ ltr +ltr +ltr);
                System.out.println(ltr + "   " + ltr);
                System.out.println(ltr + "   " + ltr);
                System.out.println(ltr + "   " + ltr);
                System.out.println(ltr + ltr+ ltr +ltr +ltr);
                System.out.println("     " + ltr);
                break;
            }

            case "R": {
                System.out.println(ltr + ltr+ ltr +ltr +ltr);
                System.out.println(ltr + "    " + ltr);
                System.out.println(ltr + ltr+ ltr +ltr +ltr);
                System.out.println(ltr + "    " + ltr);
                System.out.println(ltr + "     " + ltr);
                break;
            }

            case "S": {
                System.out.println(ltr + ltr+ ltr +ltr +ltr);
                System.out.println(ltr);
                System.out.println(ltr + ltr+ ltr +ltr +ltr);
                System.out.println("    " + ltr);
                System.out.println(ltr + ltr+ ltr +ltr +ltr);
                break;
            }

            case "T": {
                System.out.println(ltr + ltr + ltr + ltr + ltr + ltr + ltr);
                System.out.println("   " + ltr + "  ");
                System.out.println("   " + ltr + "  ");
                System.out.println("   " + ltr + "  ");
                System.out.println("   " + ltr + "  ");
                break;
            }

            case "U": {
                System.out.println(ltr + "   " + ltr);
                System.out.println(ltr + "   " + ltr);
                System.out.println(ltr + "   " + ltr);
                System.out.println(ltr + "   " + ltr);
                System.out.println(ltr + ltr + ltr + ltr + ltr);
                break;
            }

            case "V": {
                System.out.println(ltr + "   " + ltr);
                System.out.println(ltr + "   " + ltr);
                System.out.println(ltr + "   " + ltr);
                System.out.println(" " + ltr + " " + ltr + " ");
                System.out.println("  " + ltr + "  ");
                break;
            }

            case "W": {
                System.out.println(ltr + "        " + ltr);
                System.out.println(ltr + "        " + ltr);
                System.out.println(ltr + "   " + ltr + "    " + ltr);
                System.out.println(" " + ltr + " " + ltr + " " + " " + ltr + " " + ltr + " ");
                System.out.println("  " + ltr + "  " + "  " + ltr + "  ");
                break;
            }

            case "X": {
                System.out.println(ltr + "     " + ltr);
                System.out.println(" " + ltr + "   " + ltr + " ");
                System.out.println("   " + ltr + "  ");
                System.out.println(" " + ltr + "   " + ltr + " ");
                System.out.println(ltr + "     " + ltr);
                break;
            }

            case "Y": {
                System.out.println(ltr + "     " + ltr);
                System.out.println(" " + ltr + "   " + ltr + " ");
                System.out.println("   " + ltr + "  ");
                System.out.println("   " + ltr + "   ");
                System.out.println("   " + ltr + "   ");
                break;
            }

            case "Z": {
                System.out.println(ltr + ltr+ ltr +ltr +ltr);
                System.out.println("   " + ltr);
                System.out.println("  " + ltr);
                System.out.println(" " + ltr);
                System.out.println(ltr + ltr+ ltr +ltr +ltr);
                break;
            }
        }

    }
}

