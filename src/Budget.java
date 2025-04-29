import java.util.HashMap;
import java.util.Map;

public class Budget {
    //Task 5
    // A private Map to hold categories
    private Map<String, BudgetCategory> categories;

    // A constructor that takes no arguments and initializes the Map to an empty HashMap
    public Budget(){
        this.categories = new HashMap<>();
    }
}
