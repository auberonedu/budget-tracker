public class BudgetCategory implements Comparable<BudgetCategory> {
    private String category;
    private double limit;
    private double spending;

    public BudgetCategory(String category, double limit, double spending) {
        this.category = category;
        this.limit = limit;
        this.spending = spending;
    }
    
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
        return "BudgetCategory : " + category + ", limit=" + limit + ", spending=" + spending;
    }

    public double budgetSavings() {
        return limit - spending;
    }

    public int compareTo(BudgetCategory other) {
        if (budgetSavings() > other.budgetSavings()) {
            return 1;
        } else if (budgetSavings() < other.budgetSavings()) {
            return -1;
        }
        return 0;
    }
}