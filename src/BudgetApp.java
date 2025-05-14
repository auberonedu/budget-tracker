import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class BudgetApp {
    public static void main(String[] args) {

        // BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);

    
        // System.out.println("Category: " + groceries.getName());
        // System.out.println("Budget Limit: $" + groceries.getLimit());
        // System.out.println("Amount Spent: $" + groceries.getSpent());

        // System.out.println(groceries);

        Scanner scan = new Scanner(System.in);

        List<BudgetCategory> categories = new ArrayList<>();

        while(scan.hasNextLine()) {
            String category = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            // Consume \n after spent input 
            if(scan.hasNextLine()) scan.nextLine();

            categories.add(new BudgetCategory(category, limit, spent));
        }

        Collections.sort(categories, Collections.reverseOrder());

        for (BudgetCategory bc : categories){
            System.out.println(bc);
        }

        System.out.println();
        
        double totalBudgetDifference = budgetDifference(categories);
        System.out.println("Overall budget difference: $" + String.format("%.2f", totalBudgetDifference));
            
    }

    /**
     * Returns overall how much over/under budget a person is given a list of their
     * categories.
     * 
     * This should be the sum of how much over/under budget each individual category is.
     * 
     * If the person is under budget, the result will be negative. If they are over budget, the
     * result will be positive.
     * 
     * @param categories the budget categories with the spend
     * @return the total amount over/under budget
     */
    public static int budgetDifference(List<BudgetCategory> categories) {
        // TODO: You will implement this method in Wave 5
        // Note that this method SHOULD NOT have a print statement.
        // It should instead return the value.
        double totalDifference = 0;
        for (BudgetCategory category : categories) {
            totalDifference += category.getDifference();
        }
        return (int) totalDifference; 

     }
}
