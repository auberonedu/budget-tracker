public class BudgetCategory {
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

    @Override
    public String toString(){
        return "Category: " + category + 
        "\nLimit: " + limit + "\nActual: " + actual;
    }
    
}