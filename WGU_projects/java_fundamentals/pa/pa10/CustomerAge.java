//An existing class Customer() has been provided in Customer.java. Write a program in main() of CustomerAge.java to accept one string input and one integer input for a customer's name and age fields, respectively. Use the existing customer1 and customer2 reference variables provided in the template to set the name and age of both customer objects using the setName() and setAge() methods. Determine which customer is older using its getAge() method.
//
//Output the older customer's information using its printInfo() method, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.
//
//If the input is:
//
//Jane
//25
//John
//29
//
//the output is:
//
//Customer that is older:
//Name: John
//Age: 29
//
//Input to program

package WGU_projects.java_fundamentals.pa.pa10;
import java.util.Scanner;

public class CustomerAge {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        // TODO: Declare name and age variables (string, and int)
        String name;
        int age;

        // TODO: Read name and age input for customer 1
        System.out.print("Enter name for customer 1: ");
        name = scnr.nextLine();
        System.out.print("Enter age for customer 1: ");
        age = scnr.nextInt();
        scnr.nextLine(); // Consume the leftover newline

        // TODO: Set customer 1 name and age fields using mutator methods (setName() and setAge())
        customer1.setName(name);
        customer1.setAge(age);

        // TODO: Read name and age input for customer 2
        System.out.print("Enter name for customer 2: ");
        name = scnr.nextLine();
        System.out.print("Enter age for customer 2: ");
        age = scnr.nextInt();
        scnr.nextLine(); // Consume the leftover newline

        // TODO: Set customer 2 name and age fields using mutator methods (setName() and setAge())
        customer2.setName(name);
        customer2.setAge(age);

        System.out.println("Customer that is older:");

        /// TODO: Determine older customer (use getAge())
        //       and output older customer's info (use printInfo())
        if (customer1.getAge() > customer2.getAge()) {
            customer1.printInfo();
        } else {
            customer2.printInfo();
        }
    }
}
