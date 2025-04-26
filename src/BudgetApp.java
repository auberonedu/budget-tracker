import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class BudgetApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<BudgetCategory> budgets = new ArrayList<>();
        /**
        **BudgetCategory electronics = new BudgetCategory("tablet", 500, 200);
        ***System.out.println(electronics.toString());
        */
        while(scan.hasNextLine()) {
          String category = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();
            
            BudgetCategory budgetCategory = new BudgetCategory(category, limit, spent);
            budgets.add(budgetCategory);
            // Consume \n after spent input 
            if(scan.hasNextLine()) scan.nextLine();

        }
        System.out.println(budgets);   
    }              
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
    //public static int budgetDifference(List<BudgetCategory> categories) {
        // TODO: You will implement this method in Wave 5
        // Note that this method SHOULD NOT have a print statement.
        // It should instead return the value.
    //}
//}
