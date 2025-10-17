//A number is divisible by 3 if the sum of its digits is divisible by 3. For example, 153 is divisible by 3 because 1 + 5 + 3 = 9 and 9 is divisible by 3.
//
//Write a program that collects three integer inputs representing the place values of a three-digit number. Determines whether the sum of the digits is divisible by 3. If any integer entered is a negative value, output Invalid input!
//
//Output a formatted message identifying if the three-digit number is divisible by 3, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.
//
//If the input is:
//
//1
//5
//3
//
//the output is:
//
//153 is divisible by 3!
//
//Alternatively, if the input is:
//
//1
//0
//4
//
//the output is:
//
//104 is not divisible by 3!
//
//Alternatively, if the input is:
//
//1
//-5
//3
//
//the output is:
//
//Invalid input!

package WGU_projects.java_fundamentals.pa;

import java.util.Scanner;

public class pa5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int hundredsNum = sc.nextInt();

        System.out.print("Enter the second number: ");
        int tensNum = sc.nextInt();

        System.out.print("Enter the third number: ");
        int onesNum = sc.nextInt();

        // Check for invalid input
        if (hundredsNum < 0 || tensNum < 0 || onesNum < 0) {
            System.out.println("Invalid input!");
        } else {
            int number = hundredsNum * 100 + tensNum * 10 + onesNum;
            int sum = hundredsNum + tensNum + onesNum;

            if (sum % 3 == 0) {
                System.out.println(number + " is divisible by 3!");
            } else {
                System.out.println(number + " is not divisible by 3!");
            }
        }
    }
}

