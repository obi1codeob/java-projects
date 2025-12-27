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

    }
}
