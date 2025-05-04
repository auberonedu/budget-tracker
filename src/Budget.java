import java.util.HashMap;
import java.util.Map;

public class Budget {
    private Map<String, BudgetCategory> budgetMap;

    public Budget() {
        this.budgetMap = new HashMap<>();
    }

    public void add(BudgetCategory budget) {
        this.budgetMap.put(budget.getCategory(), budget);
    }

    public BudgetCategory get(String name) {
        if (budgetMap.containsKey(name)) {
            return budgetMap.get(name);
        }
        return null;
    }
}