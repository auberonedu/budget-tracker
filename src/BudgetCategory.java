public class BudgetCategory implements Comparable<BudgetCategory> {
    // Instance Variable 
    private String name;
    private double limit;
    private double spent;

    //Constructor 
    public BudgetCategory (String name, double limit, double spent){
        this.name = name;
        this.limit = limit;
        this.spent = spent;
    }

    //Getters
    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public double getSpent() {
        return spent;
    }

    public double getDifference() {
        return spent - limit; 
    }


    public int compareTo(BudgetCategory other){
        return Double.compare(this.getDifference(), other.getDifference());

    }

    @Override
    public String toString() {
        return String.format("%s : Budget Limit $%.2f, Spent $%.2f", name, limit, spent);
    }
}