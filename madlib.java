//Get Scanner module so we can collect user input
import java.util.Scanner;

//Create java class for program Madlib
public class madlib {
    //Create main where program instructions will be executed
    public static void main (String[] args) {

        //Name the scanner
        Scanner scnr = new Scanner(System.in);

        //Create variables to store user input for parts of speech for Madlib. Get user input.

        System.out.println("Welcome to Madlib: The Unbelievable Adventure!");
        System.out.println();

        //First request
        System.out.print("Enter a noun (person,place or thing; i.e. teacher, building, Oregon): ");
        String noun1 = scnr.next();

        System.out.print("Enter an adjective (to describe a noun; i.e. happy, tall): ");
        String adjective1 = scnr.next();

        System.out.print("Enter a verb (what a noun is doing: i.e. running, sitting): ");
        String verb1 = scnr.next();

        System.out.print("Enter an adverb (describes how the action is happening; i.e. slowly, quickly): ");
        String adverb1 = scnr.next();

        System.out.print("Enter a whole number(i.e. 5, 100): ");
        int num1 = scnr.nextInt();

        //Second request
        System.out.print("Enter a noun: ");
        String noun2 = scnr.next();

        System.out.print("Enter an adjective: ");
        String adjective2 = scnr.next();

        System.out.print("Enter a verb: ");
        String verb2 = scnr.next();

        System.out.print("Enter an adverb: ");
        String adverb2 = scnr.next();

        System.out.print("Enter a whole number: ");
        int num2 = scnr.nextInt();

        //Third request
        System.out.print("Enter a noun: ");
        String noun3 = scnr.next();

        System.out.print("Enter an adjective: ");
        String adjective3 = scnr.next();

        System.out.print("Enter a verb: ");
        String verb3 = scnr.next();

        System.out.print("Enter an adverb: ");
        String adverb3 = scnr.next();

        System.out.print("Enter a decimal number: ");
        double numDbl1 = scnr.nextDouble();

        //Fourth request
        System.out.print("Enter a noun: ");
        String noun4 = scnr.next();

        System.out.print("Enter an adjective: ");
        String adjective4 = scnr.next();

        System.out.print("Enter a verb: ");
        String verb4 = scnr.next();

        System.out.print("Enter an adverb: ");
        String adverb4 = scnr.next();

        System.out.print("Enter a decimal number: ");
        double numDbl2 = scnr.nextDouble();

        //Fifth request
        System.out.print("Enter a noun: ");
        String noun5 = scnr.next();

        System.out.print("Enter an adjective: ");
        String adjective5 = scnr.next();

        System.out.print("Enter a verb: ");
        String verb5 = scnr.next();

        System.out.print("Enter an adverb: ");
        String adverb5 = scnr.next();

        //Create Madlib leaving "spaces" for variables to be input
        System.out.println("One day, the " + adjective1 + " " + noun1 + " decided to " + verb1 + " " + adverb1 + " through the forest. After walking for " + num1 + " miles, it stumbled upon a " + adjective2 + " " + noun2 + " glowing strangely.\n" +
                "\n" +
                "Curious, it reached out to " + verb2 + " the object, but it suddenly floated " + adverb2 + " into the air and emitted " + numDbl1 + " beams of light. Startled, the " + noun3 + " ran toward a nearby " + adjective3 + " " + noun3 + " to hide.\n" +
                "\n" +
                "Inside, it found " + num2 + " tiny creatures who began to " + verb3 + " " + adverb3 + " around a " + adjective4 + " " + noun4 + ". They claimed the glowing object was actually a device used to " + verb4 + " time.\n" +
                "\n" +
                "Before the " + noun1 + " could respond, the device activated again, spinning " + adverb4 + " and displaying the number " + numDbl2 + ". Suddenly, everything shifted, and the " + adjective5 + " " + noun5 + " appeared out of nowhere to " + verb5 + " " + adverb5 + " as the adventure took a wild new turn.");


    }
}
