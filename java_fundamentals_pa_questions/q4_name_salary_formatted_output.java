package java_fundamentals_pa_questions;

import java.util.Scanner;

public class q4_name_salary_formatted_output {
    public static void main (String[] args) {

        //Create scanner
        Scanner scnr = new Scanner(System.in);

        //Welcome message
        System.out.println("**************************************");
        System.out.println("Hi, and welcome to Salary Generator!");
        System.out.println("**************************************\n");

        System.out.println("In this program, you provide your name, age, hourly wage, and hours worked per week, and I will generate a formatted message with your name, age, and annual salary.");

        //Declare variables
        String full_name;
        int age;
        double wage;
        int hours;
        int weeks_per_year = 52;
        double salary;

        System.out.println("What is your first and last name?");
        full_name = scnr.nextLine();

        System.out.println("How old are you?");
        age = scnr.nextInt();

        System.out.println("How many hours do you work a week?");
        hours = scnr.nextInt();

        System.out.println("What is your hourly wage?");
        wage = scnr.nextDouble();

        //Calculate salary
        salary = wage * hours * weeks_per_year;

        //Output formatted message
        System.out.println("\n**************************************");
        System.out.println("Salary Summary");
        System.out.println("**************************************");

        System.out.println("Name: " + full_name);
        System.out.println("Age: " + age);
        System.out.println("Hours per week: " + hours);

// Format salary with commas and 2 decimals
        System.out.println("Annual Salary: $" + String.format("%,.2f", salary));





    }

}
