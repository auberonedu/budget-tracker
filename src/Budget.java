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
    

    //A public method totalLimit that takes no arguments and returns a double representing the total limit across all the categories.


    // A public method totalSpent that takes no arguments and returns a double representing the total spend across all the categories.


    // A public method remainder that takes no arguments and returns a double representing how much money is left in the budget. If the budegt is over the limit, the returned value should be negative.
}
