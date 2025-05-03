public class BudgetCategory implements Comparable<BudgetCategory>{
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
        return "Category: " + category + " limit: " + limit + " spent: " + spent;
    }
    public double spentRatio(){
        return limit - spent;
    }
    public int compareTo(BudgetCategory otherBudgetCategory){
        if (spentRatio() > otherBudgetCategory.spentRatio()) {
            return 1;
        }
        if (spentRatio() < otherBudgetCategory.spentRatio()) {
            return -1;
        }
        return 0;
    }
}