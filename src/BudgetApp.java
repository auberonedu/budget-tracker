import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.io.*;

public class BudgetApp {
    public static void main(String[] args) throws FileNotFoundException {
        // BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);
        // System.out.println(groceries);

        if (args.length == 0) {
            System.out.println("Please provide a filename.");
            return;
        }

        
        Scanner scan = new Scanner(new File(args[0]));
        Map<String, BudgetCategory> categories = new HashMap<>();

        while (scan.hasNextLine()) {
            String category = scan.nextLine();
            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            // Consume \n after spent input 
            if (scan.hasNextLine()) scan.nextLine();

            BudgetCategory bc = new BudgetCategory(category, limit, spent);
            categories.put(category, bc);
        }

        
        List<BudgetCategory> sorted = new ArrayList<>(categories.values());
        sorted.sort(Collections.reverseOrder());

        
        for (BudgetCategory bc : sorted) {
            System.out.println(bc);
        }

        
        int total = budgetDifference(categories);
        System.out.println("Total budget difference: " + total);

        
        Scanner input = new Scanner(System.in); 
        while (true) {
            System.out.print("Enter a category name, 'summary' for totals, or 'quit' to exit: ");
            String userInput = input.nextLine();

            if (userInput.equalsIgnoreCase("quit")) {
                break;
            }

            if (userInput.equalsIgnoreCase("summary")) {
                double limit = totalLimit(categories);
                double spent = totalSpent(categories);
                double remaining = remainder(categories);
            
                System.out.println("Total budget limit: " + limit);
                System.out.println("Total spent: " + spent);
                System.out.println("Remaining (or over): " + remaining);
                continue;
            }

            
            BudgetCategory found = categories.get(userInput);
            if (found != null) {
                System.out.println(found);
            } else {
                System.out.println("That category does not exist.");
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
    public static int budgetDifference(Map<String, BudgetCategory> categories) {
        int total = 0;
        for (BudgetCategory c : categories.values()) {
            total += c.getSpent() - c.getLimit();
        }
        return total;
    }

    public static double totalLimit(Map<String, BudgetCategory> categories) {
        double total = 0;
        for (BudgetCategory bc : categories.values()) {
            total += bc.getLimit();
        }
        return total;
    }
    
    public static double totalSpent(Map<String, BudgetCategory> categories) {
        double total = 0;
        for (BudgetCategory bc : categories.values()) {
            total += bc.getSpent();
        }
        return total;
    }
    
    public static double remainder(Map<String, BudgetCategory> categories) {
        return totalLimit(categories) - totalSpent(categories);
    }
    

}
