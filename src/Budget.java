import java.util.HashMap;
import java.util.Map;

public class Budget {
    private Map<String, BudgetCategory> categories;

    // Constructor
    public Budget() {
        categories = new HashMap<>();
    }

    // "add" method
    public void add(BudgetCategory category) {
        categories.put(category.getCategory(), category);
    }
}
