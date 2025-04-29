import java.util.HashMap;
import java.util.Map;

public class Budget {
    //Task 5
    // A private Map to hold categories.
    private Map<String, BudgetCategory> budgetMap;

    // A constructor that takes no arguments and initializes the Map to an empty HashMap.
    public Budget(){
        this.budgetMap = new HashMap<>();
    }

    // A public method "add" that adds a category to the Map with the name being the key and the value being the BudgetCategory. It should take a single BudgetCategory as an argument.
    public void add(BudgetCategory category){
        this.budgetMap.put(category.getCategory(), category);
    }

    //A public method "get" that gets a category from the Map by name. It should take a String as an argument and return a BudgetCategory. If the category is not present, it should return null.
    public BudgetCategory get(String categoryName){
        if (this.budgetMap.containsKey(categoryName)){
        return this.budgetMap.get(categoryName);
        } else{
            return null;
        }
    }

    //A public method totalLimit that takes no arguments and returns a double representing the total limit across all the categories.
    public double totalLimit(){
        double total = 0;
        for (BudgetCategory category : budgetMap.values()){
            total += category.getLimit();
        }
        return total;
    }

    // A public method totalSpent that takes no arguments and returns a double representing the total spend across all the categories.
    public double totalSpent(){
        double total = 0;
        for(BudgetCategory category : budgetMap.values()){
            total += category.getSpent();
        }
        return total;
    }

    // A public method remainder that takes no arguments and returns a double representing how much money is left in the budget. If the budget is over the limit, the returned value should be negative.
    public double remainder(){
        return totalLimit() - totalSpent();
    }
}

