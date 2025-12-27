package wguJavaFundamentals;

import java.util.Scanner;

public class q5_divisibleBy3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declare variables
        // Numbers input from user
        int hundreds;
        int tens;
        int ones;

        //Conversions so output display three-digit number made up from number input
        String hundredsStr;
        String tensStr;
        String onesStr;

        //Get number input from user
        System.out.println("Enter a number for the hundreds place.");
        hundreds = sc.nextInt();

        System.out.println("Enter a number for the tens place.");
        tens = sc.nextInt();

        System.out.println("Enter a number for the ones place.");
        ones = sc.nextInt();

        //Convert int input to strings to display in output
        hundredsStr = Integer.toString(hundreds);
        tensStr = Integer.toString(tens);
        onesStr = Integer.toString(ones);

        //Create string that combines string numbers to make a full 3-digit number
        String fullNumber = hundredsStr + tensStr + onesStr;

        // Determine if the three-digit number is divisible by three
        if (hundreds < 0 || tens < 0 || ones < 0) {
            System.out.println("Invalid input!");
        }

        else if ((hundreds + tens + ones) % 3 == 0) {
            System.out.println(fullNumber + " is divisible by 3!");
        }

        else {
            System.out.println(fullNumber + " is not divisible by 3!");
        }

    }
}
