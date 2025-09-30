package counting_the_till;

import java.util.Scanner;

public class counting_the_till {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Till Counter 2025!");
        System.out.println();

        System.out.println("Simply provide the number of coins you have and the Till Counter will add it up for your in dollars and cents.");
        System.out.println();

        System.out.println("How many quarters do you have?");
        int quarters = sc.nextInt();

        System.out.println("How many dimes do you have?");
        int dimes = sc.nextInt();

        System.out.println("How many nickels do you have?");
        int nickels = sc.nextInt();

        System.out.println("How many pennies do you have?");
        int pennies = sc.nextInt();

        //Convert ints to doubles
        double quartersD = quarters;
        double dimesD = dimes;
        double nickelsD = nickels;
        double penniesD = pennies;

        double dollars = (quartersD * 0.25) + (dimesD * 0.10) + (nickelsD * 0.05) + (penniesD * 0.01);

        System.out.printf("Amount: $%.2f\n",dollars);
    }
}
