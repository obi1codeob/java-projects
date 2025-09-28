package calorie_burn_calculator;

import java.util.Scanner;

public class calorie_burn_calculator {
    public static void main (String [] args) {

        // Get user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Calorie Burn Calculator 2025!");
        System.out.println();

        System.out.println("When prompted, enter your age, weight, heartRate, and how long you exercised(time) to see how many calories you burned.");
        System.out.println();

        System.out.println("How old are you?");
        int age = sc.nextInt();
        System.out.println();

        System.out.println("How much do you weigh in pounds?");
        int weight = sc.nextInt();
        System.out.println();

        System.out.println("Put your index and middle finger on your opposing wrist and feel for your pulse. How many times do you feel your pulse in 10 seconds. Multiply your answer by 6 and enter it here.");
        int heartRate = sc.nextInt();
        System.out.println();

        System.out.println("How long did you exercise in minutes?");
        int time = sc.nextInt();
        System.out.println();

        double calories = ( (age * 0.2757) + (weight * 0.03295) + (heartRate * 1.0781) - 75.4991 ) * time / 8.368;

        System.out.printf("You burned: %.2f calories\n", calories);
    }
}



