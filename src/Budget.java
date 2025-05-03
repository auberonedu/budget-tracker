import java.util.HashMap;
import java.util.Map;

public class Budget {
   private Map<String, BudgetCategory> categoryMap = new HashMap<>();

   public Map<String, BudgetCategory> getCategoryMap() {
    return categoryMap;
   }   
   public Budget(){
    categoryMap = new HashMap<>();
   }
   public void add(BudgetCategory category){
    categoryMap.put(category.getCategory(), category);
   }
   public BudgetCategory get(String name){
    return categoryMap.get(name);
   }
}
