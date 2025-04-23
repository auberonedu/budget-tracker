public class BudgetCategory {
    private String category;
    private double limit;
    private double spending;
    
    public String getCategory() {
        return category;
    }

    public double getLimit() {
        return limit;
    }

    public double getSpending() {
        return spending;
    }

    @Override
    public String toString() {
        return "BudgetCategory [category=" + category + ", limit=" + limit + ", spending=" + spending + "]";
    }
}