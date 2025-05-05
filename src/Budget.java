import java.util.HashMap;
import java.util.Map;

public class Budget {
    private Map<String, BudgetCategory> categories;

    public Budget() {
        this.categories = new HashMap<>();
    }

    public void add(BudgetCategory bc) {
        categories.put(bc.getCategory(), bc);
    }

    public BudgetCategory get(String name) {
        return categories.get(name);
    }

    public double totalLimit() {
        double total = 0;
        for (BudgetCategory bc : categories.values()) {
            total += bc.getLimit();
        }
        return total;
    }

    public double totalSpent() {
        double total = 0;
        for (BudgetCategory bc : categories.values()) {
            total += bc.getSpent();
        }
        return total;
    }

    public double remainder() {
        return totalLimit() - totalSpent();
    }

    public Map<String, BudgetCategory> getAll() {
        return categories;
    }
}
