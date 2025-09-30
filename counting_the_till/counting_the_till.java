package counting_the_till;

import java.util.Scanner;

public class counting_the_till {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quarters = sc.nextInt();
        int dimes = sc.nextInt();
        int nickels = sc.nextInt();
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
