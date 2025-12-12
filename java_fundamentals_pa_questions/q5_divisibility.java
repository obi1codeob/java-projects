//*** Divisible by Three ***

package java_fundamentals_pa_questions;

import java.util.Scanner;

public class q5_divisibility {
    public static void main (String[] args) {

        Scanner scnr =  new Scanner(System.in);

        //Get 3 integer inputs from user
        System.out.println("Enter the number for the hundreds place: ");
        int hundreds = scnr.nextInt();

        System.out.println("Enter the number for the tens place: ");
        int tens = scnr.nextInt();

        System.out.println("Enter the number for the ones place: ");
        int ones = scnr.nextInt();

        //Display error message if any input numbers are negative
        if (hundreds < 0 || tens < 0 || ones < 0) {
            System.out.println("Invalid input!");
        }

        else {

            //Convert integer inputs to strings so three-digit number can be output
            String hundredsStr = Integer.toString(hundreds);
            String tensStr = Integer.toString(tens);
            String onesStr = Integer.toString(ones);
            String full_number_str = hundredsStr + tensStr + onesStr;

            System.out.println(full_number_str);

            //Convert full number string to integer
            int full_number_int = Integer.parseInt(full_number_str);

            //Determine if full number is divisible by three and output corresponding message
            if (full_number_int % 3 == 0) {
                System.out.println(full_number_str + " is divisible by 3.");
            }

            else {
                System.out.println(full_number_str + " is not divisible by 3.");
            }
        }

    }
}
