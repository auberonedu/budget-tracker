import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Locale.Category;

import org.junit.experimental.categories.Categories;

public class BudgetApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<BudgetCategory> categories = new ArrayList<>();
        categories.add(new BudgetCategory("Groceries", 500, 490));
        categories.add(new BudgetCategory("Dining out", 200, 300));
        categories.add(new BudgetCategory("Entertainment", 350, 450));
        categories.add(new BudgetCategory("Utilities", 1000, 850));
        categories.add(new BudgetCategory("Rent", 1350, 1350));
        categories.add(new BudgetCategory("Transportation", 633, 633));

        // System.out.println("Original Order");
        // for(BudgetCategory category : categories) {
        //     System.out.println(category);
        // }

        // Collections.sort(categories, Comparator.reverseOrder()); // uses the compareTo() method to reverse the order.

        // System.out.println("Sorted");
        // for(BudgetCategory category : categories) {
        //     System.out.println(category);
        // }

         System.out.println(budgetDifference(categories));



        // while(scan.hasNextLine()) {
        //     String category = scan.nextLine();

        //     double limit = scan.nextDouble();
        //     double spent = scan.nextDouble();

        //     // Consume \n after spent input 
        //     if(scan.hasNextLine()) scan.nextLine();

        //     String limitString = String.format("$%.2f", limit);
        //     String spentString = String.format("$%.2f", spent);

        //     System.out.println("Category: " + category);
        //     System.out.println("Limit: " + limitString);
        //     System.out.println("Spent: " + spentString);
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
        int totalDifference = 0;
        for(BudgetCategory category : categories) {
            totalDifference += (category.getSpent() - category.getLimit());
        }
        return totalDifference;
    }
}
