import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BudgetApp {
    public static void main(String[] args) {
        // BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);
        // BudgetCategory rent = new BudgetCategory("Rent", 1500, 1500);

        // System.out.println(groceries.toString());

        Scanner scan = new Scanner(System.in);
        List<BudgetCategory> myBudgetList = new ArrayList<>();

        while (scan.hasNextLine()) {
            String category = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            // Consume \n after spent input
            if (scan.hasNextLine())
                scan.nextLine();

            String limitString = String.format("%.2f", limit);
            String spentString = String.format("%.2f", spent);

            BudgetCategory budget = new BudgetCategory(category, Double.parseDouble(limitString),
                    Double.parseDouble(spentString));

            myBudgetList.add(budget);
            // System.out.println("The budget limit for " + category + " was: " +
            // limitString +
            // " but the actual spend was " + spentString);
        }

        System.out.println(myBudgetList);
        Collections.sort(myBudgetList, Collections.reverseOrder());
        System.out.println(myBudgetList);
        System.out.println("The budgetDifference : " + budgetDifference(myBudgetList));
    }

    /**
     * Returns overall how much over/under budget a person is given a list of their
     * categories.
     * 
     * This should be the sum of how much over/under budget each individual category
     * is.
     * 
     * If the person is under budget, the result will be negative. If they are over
     * budget, the
     * result will be positive.
     * 
     * @param categories the budget categories with the spend
     * @return the total amount over/under budget
     */
    public static int budgetDifference(List<BudgetCategory> categories) {
        // TODO: You will implement this method in Wave 5
        // Note that this method SHOULD NOT have a print statement.
        // It should instead return the value.

        int result = 0;

        for (BudgetCategory cat: categories) {
            if (cat.budgetSavings() > 0) {
                result--;
            } else if (cat.budgetSavings() < 0) {
                result++;
            }
        }
        return result;
    }
}
