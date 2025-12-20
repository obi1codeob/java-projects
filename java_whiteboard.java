import java.util.Random;
import java.util.Scanner;

public class java_whiteboard {
    public static void main(String[] args) {

        //Create a scanner
        Scanner scnr = new Scanner(System.in);

        //Create a random number generator
        Random random = new Random();

        //Get random number parameters from input
        System.out.println("Enter low number.");
        int lowNum = scnr.nextInt();

        System.out.println("Enter high number.");
        int highNum = scnr.nextInt();



        //Generate and output a random number 5 times based on a low and high numbers input by user
        for (int i = 0; i < 5; i++) {
            //Create a variable to store a randomly generated number between 1 and 10
            int num = random.nextInt(lowNum, highNum);

            System.out.println(num);
        }





    }
}
