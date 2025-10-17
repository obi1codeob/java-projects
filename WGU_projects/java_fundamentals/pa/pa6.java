//Write a program that collects a full name as one string input.
//
//Format and output the name as shown below:
//
//lastInitial., firstName middleInitial.
//
//If no middle name was provided, format and output the name as shown below:
//
//lastInitial., firstName
//
//If the input is:
//
//Pat Silly Doe
//
//the output is:
//
//D., Pat S.
//
//Alternatively, if the input is:
//
//Julia Clark
//
//the output is:
//
//C., Julia

package WGU_projects.java_fundamentals.pa;

import java.util.Scanner;

public class pa6 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Prompt and read the full name
        System.out.print("Enter full name: ");
        String fullName = scnr.nextLine().trim();

        // Split name into parts
        String[] parts = fullName.split("\\s+");

        // Check how many parts there are
        if (parts.length < 2) {
            System.out.println("Please enter at least a first and last name.");
            return;
        }

        String firstName = parts[0];
        String middleName = (parts.length == 3) ? parts[1] : "";
        String lastName = parts[parts.length - 1];

        // Extract initials
        char lastInitial = Character.toUpperCase(lastName.charAt(0));
        String formattedName;

        if (!middleName.isEmpty()) {
            char middleInitial = Character.toUpperCase(middleName.charAt(0));
            formattedName = String.format("%c., %s %c.", lastInitial, firstName, middleInitial);
        } else {
            formattedName = String.format("%c., %s", lastInitial, firstName);
        }

        // Output the formatted name
        System.out.println(formattedName);
    }
}
