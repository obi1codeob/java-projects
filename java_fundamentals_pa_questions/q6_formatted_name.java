package java_fundamentals_pa_questions;

import java.util.Scanner;

public class q6_formatted_name {
    public static void main (String[] args) {

        Scanner scnr = new Scanner(System.in);

        //Get full name from user
        System.out.println("What is your full name?");
        String full_name = scnr.nextLine();

        //Put name parts into an array
        String[] name_parts = full_name.split(" ");

        //If full name contains a first, middle, and last name
        if (name_parts.length == 3) {

            //Get first name
            String first_name = name_parts[0];

            //Get middle name
            String middle_name = name_parts[1];
            //Get first initial of middle name
            char middle_initial = middle_name.charAt(0);

            //Get last name
            String last_name = name_parts[2];
            //Get first initial of middle name
            char last_initial = last_name.charAt(0);

            //Output formatted message with last initial, first name, middle initial;
            System.out.println(last_initial + "., " + first_name + " " + middle_initial + ".");
        }

        else if (name_parts.length == 2) {

            //Get first name
            String first_name = name_parts[0];

            //Get last name
            String last_name = name_parts[1];
            //Get first initial of middle name
            char last_initial = last_name.charAt(0);

            //Output formatted message with last initial, first name;
            System.out.println(last_initial + "., " + first_name);
        }

        else {
            //Get first name
            String first_name = name_parts[0];
            System.out.println(first_name);
        }

    }
}
