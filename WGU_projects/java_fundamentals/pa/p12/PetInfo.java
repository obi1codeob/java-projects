//Write code in the Pet.java file that has the following fields, constructors, and methods:
//
//Fields
//
//    name: string field for the name of the pet
//    type: string field for the type of pet
//    age: integer field for the age of the pet
//
//Constructors
//
//    Pet: no-argument constructor
//        The Pet constructor should assign the value "unknown" to the name field, the value "unknown" to the type field, and the value 0 to the age field.
//    Pet: overloaded constructor with two string parameter variables for the name and type, and one integer parameter variable for the age
//        The overloaded Pet constructor should assign the parameter variable values to the name, type, and age fields, accordingly.
//
//Methods
//
//    setName: mutator method that sets the name field
//    setType: mutator method that sets the type field
//    setAge: mutator method that sets the age field
//    getName: accessor method that returns the name field value
//    getType: accessor method that returns the type field value
//    getAge: accessor method that returns the age field value
//
//If the input is:
//
//Max
//Bulldog
//3
//Leo
//Boston-Terrier
//6
//
//the output is:
//
//Name: unknown
//Type: unknown
//Age: 0
//
//Name: Max
//Type: Bulldog
//Age: 3
//
//Name: Leo
//Type: Boston-Terrier
//Age: 6

package WGU_projects.java_fundamentals.pa.p12;

import java.util.Scanner;

public class PetInfo {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String name, type;
        int age;

        Pet pet1 = new Pet();

        System.out.print("Enter the first pet's name: ");
        name = scnr.next();
        System.out.print("Enter the first pet's type: ");
        type = scnr.next();
        System.out.print("Enter the first pet's age: ");
        age = scnr.nextInt();
        Pet pet2 = new Pet(name, type, age);

        System.out.print("Enter the second pet's name: ");
        name = scnr.next();
        System.out.print("Enter the second pet's type: ");
        type = scnr.next();
        System.out.print("Enter the second pet's age: ");
        age = scnr.nextInt();
        Pet pet3 = new Pet(name, type, age);

        System.out.println("Name: " + pet1.getName());
        System.out.println("Type: " + pet1.getType());
        System.out.println("Age: " +  pet1.getAge() + "\n");

        System.out.println("Name: " + pet2.getName());
        System.out.println("Type: " + pet2.getType());
        System.out.println("Age: " +  pet2.getAge()  + "\n");

        System.out.println("Name: " + pet3.getName());
        System.out.println("Type: " + pet3.getType());
        System.out.println("Age: " +  pet3.getAge());
    }
}
