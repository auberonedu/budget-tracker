public class BudgetCategory implements Comparable<BudgetCategory> {
    private String category;
    private double limit;
    private double spent;

    public BudgetCategory(String category, double limit, double spent) {
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

    public double differenceResult() {
        return limit - spent;
    }

    @Override
    public String toString() {
        return this.category + " " + this.limit + " " + this.spent;
    }

    @Override
    public int compareTo(BudgetCategory budget) {
        double differenceResult = this.differenceResult(); 
        double other = budget.differenceResult();

        if(differenceResult < other) {
            return -1;
        }

        if(differenceResult > other) {
            return 1;

        } else {
            return 0;
        }
    }
}


   
