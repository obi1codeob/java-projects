//PROGRAM: ASCII Letter Drawing

// OBJECTIVE: Write a program that outputs the pattern shown beow, ending with a newine. Each ine of the pattern contains 5 characters including whitespace.

// The output is:**

/*H       H
    H       H
    HHHHH
    H       H
    H       H
*/

import java.util.Scanner;

public class ascii_letter_drawing {
    public static void main(String[] args) {

        //FUNCTION 1: Use print function to output letter pattern
        System.out.println("H   H");
        System.out.println("H   H");
        System.out.println("HHHHH");
        System.out.println("H   H");
        System.out.println("H   H");

        //Create blank line to separate functions
        System.out.println();

        //FUNCTION 2: Use for loop to output letter pattern
        for (int i = 0; i < 2; i++) {
            System. out.println("H   H");
        }

        System.out.println("HHHHH");

        for (int i = 0; i < 2; i++) {
            System. out.println("H   H");
        }

              //FUNCTION 3: Get ASCII character from use and create the letter "H"

        //Create a scanner
        Scanner scnr  = new Scanner(System.in);

        //Get ASCII character from user
        System.out.println("Choose a keyboard character to draw with.");
        String userChar = scnr.nextLine();

        //Use for loops to output ASCII character
        for (int i = 0; i < 2; i++) {
            System. out.println(userChar + "   " + userChar);
        }

        System.out.println(userChar+ userChar+ userChar+ userChar+ userChar);

        for (int i = 0; i < 2; i++) {
            System. out.println(userChar + "   " + userChar);
        }


    }
}

