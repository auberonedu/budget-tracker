public class BudgetCategory {
    private String category;
    private double limit;
    private double spent;

    // Constructor
    public BudgetCategory(String category, double limit, double spent){
        this.category = category;
        this.limit = limit;
        this.spent = spent;
    } 

    // Getters
    public String getCategory() {
        return category;
    }
    public double getLimit() {
        return limit;
    }
    public double getSpent() {
        return spent;
    }

    public String toString(){
        return "The budget limit for " + category + " was: " + limit + " but the actual spend was " + spent;

    }



    
}