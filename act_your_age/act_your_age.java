package act_your_age;

import java.util.Scanner;

public class act_your_age {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Act Your Age, the calculator that takes your age in years, and outputs how old your are in months, weeks, days, hours, minutes, and seconds.");
        System.out.println();

        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println();

        int monthsAge = age * 12;
        int weeksAge = age * 52;
        int daysAge = age * 365;
        int hoursAge = age * 24 * 365;
        int minutesAge = age * 60 * hoursAge;
        int secondsAge = age * 60 * 60 * minutesAge;

        System.out.println("You are " + age + " " + (age == 1 ? "year,\n" : "years,\n") +
                String.format("%,d",monthsAge) + " months,\n" +
                String.format("%,d",weeksAge) + " weeks,\n" +
                String.format("%,d",daysAge) + " days,\n" +
                String.format("%,d",hoursAge) + " hours,\n" +
                String.format("%,d",minutesAge) + " minutes and\n" +
                String.format("%,d",secondsAge) + " seconds old.");


    }
}
