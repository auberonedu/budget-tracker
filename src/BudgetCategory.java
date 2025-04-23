public class BudgetCategory {
    private String category;
    private double limit;
    private double spend;

    public BudgetCategory(String category, double limit, double spend){
        this.category = category;
        this.limit = limit;
        this.spend = spend;
    }

    public String getCategory() {
        return category;
    }

    public double getLimit() {
        return limit;
    }

    public double getSpend() {
        return spend;
    }
    @Override

    public String toString(){
        return this.category +" "+ this.spend +" "+this.limit ;
    }
}