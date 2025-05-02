import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BudgetApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);

        // System.out.println("Name: " + groceries.getName());
        // System.out.println("Budgeted Amount: $" + groceries.getLimit());
        // System.out.println("Actual Spent: $" + groceries.getSpend());

        // // Using toString
        // System.out.println(groceries);

        // Creating a list
        List<BudgetCategory> categoryList = new ArrayList<>();

        while (scan.hasNextLine()) {
            String category = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            // Consume \n after spent input
            if (scan.hasNextLine())
                scan.nextLine();

            BudgetCategory item = new BudgetCategory(category, limit, spent);
            categoryList.add(item);

            String limitString = String.format("$%.2f", limit);
            String spentString = String.format("$%.2f", spent);
            System.out.println("The budget limit for " + category + " was: " +
                    limitString +
                    " but the actual spend was " + spentString);
        }

        System.out.println(categoryList);
        System.out.println();
        Collections.sort(categoryList, Collections.reverseOrder());
        System.out.println(categoryList);

        double totalDiff = budgetDifference(categoryList);
        System.out.printf("TOTAL BUDGET DIFFERENCE: $%.2f", totalDiff);
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
    public static double budgetDifference(List<BudgetCategory> categories) {
        // TODO: You will implement this method in Wave 5
        // Note that this method SHOULD NOT have a print statement.
        // It should instead return the value.

        double totalDifference = 0.0;

        for (BudgetCategory category : categories) {
            totalDifference += category.getLimit() - category.getSpend();
        }

        return totalDifference;

    }
}
