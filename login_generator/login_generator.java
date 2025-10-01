package login_generator;

import java.util.Scanner;

public class login_generator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Get input from user
        System.out.println("What is your first name?");
        String firstName = sc.nextLine();

        System.out.println("What is your last name?");
        String lastName = sc.nextLine();

        System.out.println("Choose a 4-digit number");
        int number = sc.nextInt();

        //Build login name
        //If the length of firstName is greater than 6, take the first 6 characters. Otherwise, use the full firstName and store it in a variable
        String loginFirst = firstName.length() > 6 ? firstName.substring(0, 6) : firstName;

        //Get the first letter of the last name
        String loginLast = lastName.substring(0,1);

        //Get the last digit of the number
        int lastDigit = number % 10;

        //Output the final login username
        System.out.println("Your login name: " + loginFirst + loginLast + "_" + lastDigit);




    }
}
