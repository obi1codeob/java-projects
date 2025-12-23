package toll_bridge;

import java.util.Scanner;

public class toll_bridge {
    public static void main(String[] args) {

        // Ask user to enter time(by the hour)
        System.out.println("To best determine your toll, please provide the time by the nearest hour.");

        // Gets user input
        Scanner sc = new Scanner(System.in);

        //Stores user input in integer variable "time"
        int time = sc.nextInt();

        //Stores toll amount as floating-point number
        double tollAmount;

        //Conditional statement that determines toll amount based on time of day(hour on 24 hour clock)
        if (time < 6) {
            tollAmount = 1.55;
        }

        else if (time < 10) {
            tollAmount = 4.65;
        }

        else if (time < 18) {
            tollAmount = 2.35;
        }

        else {
            tollAmount = 1.55;
        }

        //Display time and toll amount using formatted string that adds two decimal places to toll amount number.
        System.out.printf("Based on the time you entered: " + time + ", your toll amount is $%.2f.", tollAmount);



    }
}
