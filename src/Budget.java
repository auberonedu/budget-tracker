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

    // "get" method
    public BudgetCategory get(String name) {
        return categories.get(name);
    }

    // Total methods
    public double totalLimit() {
        double total = 0.0;
        for (BudgetCategory bc : categories.values()) {
            total += bc.getLimit();
        }
        return total;
    }

    public double totalSpent() {
        double total = 0.0;
        for (BudgetCategory bc : categories.values()) {
            total += bc.getSpent();
        }
        return total;
    }
}
