public class BudgetCategory implements Comparable<BudgetCategory>{
    private String category;
    private double limit;
    private double actual;

    public BudgetCategory(String category, double limit, double actual){
        this.category = category;
        this.limit = limit;
        this.actual = actual;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getActual() {
        return actual;
    }

    public void setActual(double actual) {
        this.actual = actual;
    }

    public int compareTo(BudgetCategory other){
        if (limitPerformance() > other.limitPerformance()){
            return -1;
        } else if (limitPerformance() < other.limitPerformance()){
            return 1;
        }

        return 0;
    }

    public double limitPerformance(){
        return actual - limit;
    }

    @Override
    public String toString(){
        return "Category: " + category + 
        "\nLimit: " + limit + "\nActual: " + actual;
    }
    
}