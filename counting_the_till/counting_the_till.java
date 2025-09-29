package counting_the_till;

import java.util.Scanner;

public class counting_the_till {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quarters = sc.nextInt();
        int dimes = sc.nextInt();
        int nickels = sc.nextInt();
        int pennies = sc.nextInt();

        double dollars = (quarters * 0.25) + (dimes * 0.10) + (nickels * 0.05) + (pennies * 0.01);

        System.out.printf("Amount: $%.2f\n",dollars);
    }
}
