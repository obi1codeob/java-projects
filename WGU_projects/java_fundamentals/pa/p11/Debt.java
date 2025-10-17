package WGU_projects.java_fundamentals.pa.p11;

public class Debt {
    // TODO: Declare private field - debtRatio
    private double debtRatio;

    // TODO: Define private method - calculateDR()
    private void calculateDR(double totalDebt, double totalAssets) {
        if (totalAssets != 0) { // Prevent division by zero
            debtRatio = totalDebt / totalAssets;
        } else {
            debtRatio = 0;
        }
    }

    // TODO: Define public method - getDR()
    public double getDR() {
        return debtRatio;
    }

    // TODO: Define public method - SetDR
    public void setDR(double totalDebt, double totalAssets) {
        calculateDR(totalDebt, totalAssets);
    }

}
