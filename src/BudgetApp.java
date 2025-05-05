import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.io.File;

public class BudgetApp {
    public static void main(String[] args) throws FileNotFoundException {
        /**BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);
        System.out.println(groceries);

        BudgetCategory rent = new BudgetCategory("Rent", 1000, 950);
        System.out.println(rent);**/

        String filename = args[0];
        Budget budget = new Budget();

        Scanner scan = new Scanner(new File(filename));

        //Map<String, BudgetCategory> categories = new HashMap<>();

        while(scan.hasNextLine()) {
            String category = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            // Consume \n after spent input 
            if(scan.hasNextLine()) scan.nextLine();

            //categories.put(category, new BudgetCategory(category, limit, spent));

            //String limitString = String.format("$%.2f", limit);
            //String spentString = String.format("$%.2f", spent);
            BudgetCategory budgetCategory = new BudgetCategory(category, limit, spent);
            budget.add(budgetCategory);
        }

        /* // Sort from most to least overspent category
        Collections.sort(categories, Collections.reverseOrder());

        for (BudgetCategory bc : categories) {
            System.out.println(bc);
        } */

        Scanner userScanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter the name of the category, 'summary' or 'quit': ");
            String userInput = userScanner.nextLine();

            if (userInput.equalsIgnoreCase("quit")) {
                break;
            } else if (userInput.equals("summary")) {
                double totalLimit = budget.totalLimit();
                double totalSpent = budget.totalSpent();
                double remainder = budget.remainder();

                System.out.printf("Total budget limit: $%.2f%n", totalLimit);
                System.out.printf("Total spent: $%.2f%n", totalSpent);
                System.out.printf("Budget remainder: $%.2f%n", remainder);

            } else {
                BudgetCategory result = budget.get(userInput);
                if (result != null) {
                    System.out.println(result);
                } else {
                System.out.println("Category not found");
                }
            }
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
    public static int budgetDifference(List<BudgetCategory> categories) {
        // TODO: You will implement this method in Wave 5
        // Note that this method SHOULD NOT have a print statement.
        // It should instead return the value.
        double total = 0.0;
        
        for (BudgetCategory bc : categories) {
            total += bc.getSpent() - bc.getLimit();
        }
        return (int)Math.round(total);
    }
}
