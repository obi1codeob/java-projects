package wguJavaFundamentals;

import java.util.Scanner;

public class q4_nameAgeSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declare variables
        String name;
        String salary;
        int age;
        char currency = '$';

        //Get full name from user
        System.out.println("What is your full name?");
        name = sc.nextLine();

        //Get salary from user;
        System.out.println("How much do you make in a year?");
        salary = sc.nextLine();

        //Get age from user;
        System.out.println("How old are you?");
        age = sc.nextInt();

        //Output formatted message with user name, age, and salary with currency
        System.out.println(name + " is " + age + " years old and makes an annual salary of " + currency + salary + "." );
    }
}
