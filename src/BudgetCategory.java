public class BudgetCategory {
    private String category;
    private double limit;
    private double spent;

    public BudgetCategory(String category, double limit, double spent){
        this.category = category;
        this.limit = limit;
        this.spent = spent;
    }

    public String getCategory() {
        return category;
    }

    public double getLimit() {
        return limit;
    }

    public double getSpent() {
        return spent;
    }
    public double getDifference() {
        return limit - spent; // positive means under budget
    }

    @Override

    public String toString(){
        return this.category + " " + this.limit + " " + this.spent;
    }

  
    public int compareTo(BudgetCategory other) {
        double thisDiff = this.getDifference();
        double otherDiff = other.getDifference();

        return Double.compare(otherDiff, thisDiff); 
    }

   
}