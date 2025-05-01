import java.util.Map;
import java.util.HashMap;

public class Budget {
  private Map<String, BudgetCategory> budgetsMap;

  public Budget(){
    budgetsMap = new HashMap<>();
  }

  public void addBudgetCategory(String name, BudgetCategory budget){
    budgetsMap.put(name, budget);
  }

  public BudgetCategory getBudgetCategory(String name){
    if (!budgetsMap.containsKey(name)){
      // System.out.println("Budget does not exist." );
      return null;
    }

    return budgetsMap.get(name);

    
    // System.out.println(budgetsMap.get(name).toString());
  }

  public double totalLimit(){
    double total = 0;
    for (String name : budgetsMap.keySet()){
      total += budgetsMap.get(name).getLimit();
    }

    return total;
  }

  public double totalSpent(){
    double total = 0;
    for (String name : budgetsMap.keySet()){
      total += budgetsMap.get(name).getActual();
    }

    return total;
  }

  public double budgetCheck(){
    return totalLimit() - totalSpent();
  }

}
