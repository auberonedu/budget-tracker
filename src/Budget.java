import java.util.HashMap;
import java.util.Map;

public class Budget {

    private Map<String, BudgetCategory> budgets;

    public Budget() {
        
        this.budgets = new HashMap<>();
    }

    public void add(BudgetCategory budgetCategory) {
        budgets.put(budgetCategory.getCategory(), budgetCategory);
    }
    
    public BudgetCategory get(String categoryName) {
        return budgets.get(categoryName);
    }

    public double totalLimit() {
       
        double totalLimit = 0.0;
        
        for (BudgetCategory category : budgets.values()) {
            totalLimit += category.getLimit();
        }
        return totalLimit;
    }

    public double totalSpent() {
        
        double totalSpent = 0.0;

        for (BudgetCategory category : budgets.values()) {
            totalSpent += category.getActual();
        }
        return totalSpent;
    }

    public double remainder() {
            return totalSpent() - totalLimit();
        }
    }
