package wguJavaFundamentals;

//Import scanner utility to collect user input
import java.util.Scanner;

public class q2Multiplication {
    public static void main(String[] args) {

        //Create new scanner
        Scanner sc = new Scanner(System.in);

        //Declare variables
        int starting_num;
        int multiplier;
        int product;

        //Get starting num from user
        System.out.print("Enter a starting number: ");
        starting_num = sc.nextInt();

        //Get multiplier from user
        System.out.print("Enter a multiplier: ");
        multiplier = sc.nextInt();

        //Compute the product
        product = starting_num * multiplier;

        //Output product
        System.out.print(product);

        //Add space after product
        System.out.print(" ");

        //Output product two more time, each time multiplying product by multiplier
        product *= multiplier;
        System.out.print(product);

        //Add space after product
        System.out.print(" ");

        product *= multiplier;
        System.out.println(product);
    }
}
