public class BudgetCategory implements Comparable<BudgetCategory> {
    // instance variables
    private String name;
    private double limit;
    private double spend;

    // Constructor
    public BudgetCategory(String name, double limit, double spend) {
        this.name = name;
        this.limit = limit;
        this.spend = spend;
    } // end of constructor

    // adding getters
    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public double getSpend() {
        return spend;
    }

    // adding a toString
    @Override
    public String toString() {
        return "\nCategory: " + name +
                "\nBudget: $" + limit +
                "\nSpent: $" + spend + "\n";
    }

    public double getOverUnderBudget() {
        return limit - spend;
    }

    public int compareTo(BudgetCategory other) {
        double thisDifference = this.getOverUnderBudget();
        double otherDifference = other.getOverUnderBudget();

        return Double.compare(otherDifference, thisDifference);
    }

} // end of class