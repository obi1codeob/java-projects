//Debt ratio is a ratio of total debt to total assets, calculated using the formula:
//Total Debt / Total Assets
//
//The DebtMeasure.java file contains existing code that collects input for totalDebt and totalAssets, then passes the inputs into the Debt object's setDR() method. The code then returns the debtRatio using the Debt object's getDR() method.
//
//Write code in the Debt class of Debt.java that has the following field and methods:
//
//    debtRatio: private field of type double
//
//    calculateDR: a private helper method with two parameter variables of type double for totalDebt and totalAssets
//        The calculateDR method should calculate the debt ratio and assign the results to the debtRatio field.
//        Use the method signature private void calculateDR(double totalDebt, double totalAssets).
//
//    getDR: public accessor method that returns the debtRatio field value
//
//    setDR: public mutator method that passes the inputs, totalDebt and totalAssets, to the Debt class
//
//Ensure your program output matches the example formatting below and works for a variety of input values.
//
//If the input is:
//
//250000
//300000
//
//the output when 250000 is the total debt and 300000 is the total assets is:
//
//The Company's total debt is in the amount of $250,000.00, and total assets are in the amount of $300,000.00, which gives a debt ratio of 0.83.
//
//Note: Use the printf() function for the print statement in this activity.

package WGU_projects.java_fundamentals.pa.p11;

import java.util.Scanner;

public class DebtMeasure {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Debt debt1 = new Debt();

        System.out.print("Enter total debt: ");
        double totalDebt = scnr.nextDouble();
        System.out.print("Enter total assets: ");
        double totalAssets = scnr.nextDouble();

        debt1.setDR(totalDebt, totalAssets);

        System.out.printf("The Company's total debt is in the amount of $%,.2f, and total assets are in the amount of $%,.2f, which gives a debt ratio of %.2f.\n", totalDebt, totalAssets, debt1.getDR());
    }
}
