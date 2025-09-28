import java.util.Scanner;

package calorie_burn_calculator;

public class calorie_burn_calculator {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        int weight = sc.nextInt();
        int heartRate = sc.nextInt();
        int time = sc.nextInt();

        double calories = ( (age * 0.2757) + (weight * 0.03295) + (heartRate * 1.0781) - 75.4991 ) * time / 8.368;


    }
}



