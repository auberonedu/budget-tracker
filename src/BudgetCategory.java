public class BudgetCategory implements Comparable<BudgetCategory>{
    private String category;
    private double limit;
    private double spent;

    // Constructor
    public BudgetCategory(String category, double limit, double spent){
        this.category = category;
        this.limit = limit;
        this.spent = spent;
    } 

    // Getters
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
    public String toString(){
        return "The budget limit for " + category + " was: " + limit + " but the actual spend was " + spent;

    }

    public double differences(){
        return spent - limit;
    }

    // CompareTo method
    public int compareTo(BudgetCategory other){
        if (differences() > other.differences()){
            return -1;
        }
        if (differences() < other.differences()){
            return 1;
        }
        return 0;
    }



    
}