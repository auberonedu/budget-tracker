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

    @Override 
    public String toString() {
        return category + " " + limit + " " + spent;
    }

    private double getOverUnderAmount() {
        return spent - limit;
    }

    @Override
    public int compareTo(BudgetCategory other) {
        double thisOverUnder = this.getOverUnderAmount();
        double otherOverUnder = other.getOverUnderAmount();

        if (thisOverUnder < otherOverUnder) {
            return -1;
        } else if (thisOverUnder > otherOverUnder) {
            return 1;
        } else {
            return 0;
        }
    }
}