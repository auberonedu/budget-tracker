public class BudgetCategory {
    private String category;
    private double limit;
    private double spent;
    
    public String getCategory() {
        return category;
    }

    public double getLimit() {
        return limit;
    }

    public double getSpent() {
        return spent;
    }

    public BudgetCategory(String category, double limit, double spent){
        this.category = category;
        this.limit = limit;
        this.spent = spent;
    }

    @Override
    public String toString(){
        return "Category: " + category + "\nlimit: " + limit + "\nspent: " + spent;
    }
}