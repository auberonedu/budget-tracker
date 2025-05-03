import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BudgetApp {
    public static void main(String[] args) throws FileNotFoundException{
        // Scanner scan = new Scanner(System.in);
        String filename = args[0];

        Scanner scan = new Scanner(new File(filename));
        List<BudgetCategory> budgetList = new ArrayList<>();
        while(scan.hasNextLine()) {
            String category = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            // Consume \n after spent input 
            if(scan.hasNextLine()) scan.nextLine();
            BudgetCategory budgetCategory = new BudgetCategory(category, limit, spent);
            budgetList.add(budgetCategory);

            String limitString = String.format("$%.2f", limit);
            String spentString = String.format("$%.2f", spent);
        }
        // BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);
        // System.out.println(groceries);
        System.out.println(budgetList);
        //This is smallest to largest in the sense that it is the least underbudget not over
        // Collections.sort(budgetList, Collections.reverseOrder());

        // Collections.sort(budgetList);
        // System.out.println(budgetList);
        // System.out.println();
        // System.out.println("Overall over/under budget: " + budgetDifference(budgetList) +"$");
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
        int finalBudgetDifference = 0;
        for (BudgetCategory budgetCategory:categories) {
            finalBudgetDifference += budgetCategory.spentRatio();
        }
        return finalBudgetDifference;
    }
}
