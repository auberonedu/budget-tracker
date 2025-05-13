import java.util.HashMap;
import java.util.Map;

public class Budget {
    private Map<String, BudgetCategory> categories = new HashMap<>();

    public Budget() { 
        this.categories = new HashMap<>();
    }
    public void add(BudgetCategory othCategory) {
        String categoryName = othCategory.getCategory();
        categories.put(categoryName, othCategory);
    }
    public BudgetCategory get(String categoryString) {
        return categories.get(categoryString);
    }
    public double totalLimit() {
        double count = 0.0;
        for(BudgetCategory budgetCategory : categories.values()) {
            count += budgetCategory.getLimit();
        }
        return count;
    }
    public double totalSpent() {
        double count = 0;
        for(BudgetCategory budgetCategory : categories.values()) {
            count += budgetCategory.getSpent();
        }
        return count;
    }
    public double remainder() {
        double difference = totalSpent() - totalLimit();
        return difference;
    }
}