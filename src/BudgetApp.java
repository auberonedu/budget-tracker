import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

        
        Budget budget = new Budget();

        
        Scanner scan = new Scanner(new File(args[0]));
        while (scan.hasNextLine()) {
            String category = scan.nextLine();
            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            // Consume \n after spent input 
            if (scan.hasNextLine()) scan.nextLine();

            BudgetCategory bc = new BudgetCategory(category, limit, spent);
            budget.add(bc);
        }

        
        List<BudgetCategory> sorted = new ArrayList<>(budget.getAll().values());
        sorted.sort(Collections.reverseOrder());

        
        for (BudgetCategory bc : sorted) {
            System.out.println(bc);
        }

        
        int total = (int)(budget.totalSpent() - budget.totalLimit());
        System.out.println("Total budget difference: " + total);

        
        Scanner input = new Scanner(System.in); 
        while (true) {
            System.out.print("Enter a category name, 'summary' for totals, or 'quit' to exit: ");
            String userInput = input.nextLine();

            if (userInput.equalsIgnoreCase("quit")) {
                break;
            }

            if (userInput.equalsIgnoreCase("summary")) {
                double limit = budget.totalLimit();
                double spent = budget.totalSpent();
                double remaining = budget.remainder();

                System.out.println("Total budget limit: " + limit);
                System.out.println("Total spent: " + spent);
                System.out.println("Remaining (or over): " + remaining);
                continue;
            }

            
            BudgetCategory found = budget.get(userInput);
            if (found != null) {
                System.out.println(found);
            } else {
                System.out.println("That category does not exist.");
            }
        }
    }
}
