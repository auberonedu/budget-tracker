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

    public int compareTo(BudgetCategory other) {
        double differenceResult = this.differenceResult(); 
        double budgetVal = other.differenceResult();

        if(differenceResult < budgetVal) {
            return -1;
        }

        if(differenceResult > budgetVal) {
            return 1;

        } else {
            return 0;
        }
    }
}


   
