import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BudgetApp {
    public static void main(String[] args) throws FileNotFoundException{

        String filename = args[0];
        Scanner scan = new Scanner(new File(filename));

        List<BudgetCategory> categories = new ArrayList<>();

        Map<String, BudgetCategory> categoryMap = new HashMap<>();

        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            BudgetCategory category = new BudgetCategory(name, limit, spent);

            categories.add(category);

            categoryMap.put(name, category);

            // String aprString = String.format("%.2f%%", apr);
            // String balanceString = String.format("$%.2f", balance);
            // System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }

    Scanner userInput = new Scanner(System.in);
    String input = "";
    BudgetCategory lastSelectedCategory = null;

    System.out.println("\nType a category name to view it.");
    System.out.println("Type 'summary' to see budget info for the selected category.");
    System.out.println("Type 'quit' to exit.");

    while (true) {
        System.out.print("Enter input: ");
        input = userInput.nextLine();

        if (input.equalsIgnoreCase("quit")) {
            System.out.println("Exiting category lookup.");
            break;
        }

        if (input.equalsIgnoreCase("summary")) {
            if (lastSelectedCategory == null) {
                System.out.println("No category selected yet. Enter a category name first.");
            } else {
                double limit = lastSelectedCategory.getLimit();
                double spent = lastSelectedCategory.getSpent();
                double difference = spent - limit;

                System.out.printf("Summary for category: %s%n", lastSelectedCategory.getCategory());
                System.out.printf("  Limit: $%.2f%n", limit);
                System.out.printf("  Spent: $%.2f%n", spent);

                if (difference > 0) {
                    System.out.printf("  OVER budget by $%.2f%n", difference);
                } else if (difference < 0) {
                    System.out.printf("  UNDER budget by $%.2f%n", -difference);
                } else {
                    System.out.println("  Exactly on budget.");
                }
            }
            continue;
        }
        BudgetCategory category = categoryMap.get(input);

        if (category != null) {
            lastSelectedCategory = category;
            System.out.println(category); 
        } else {
            System.out.println("Category '" + input + "' not found.");
        }
    }
    }
}
            
    

        // Use a for loop for repeated input
        // System.out.print("Enter category name (or 'done' to finish): ");
        // String category = scan.nextLine();

        // while (!category.equalsIgnoreCase("done")) {
        //     System.out.print("Enter limit for " + category + ": ");
        //     double limit = Double.parseDouble(scan.nextLine());
        //     System.out.println("Enter spent for "+ category+ ": ");
        //     double spent = Double.parseDouble(scan.nextLine());
        //     BudgetCategory c = new BudgetCategory(category, limit, spent);
        //     categories.add(c);

        //     System.out.print("Enter category name (or 'done' to finish): ");
        //     category = scan.nextLine();
        // }

        // // Print the categories using a for loop
        // System.out.println(categories);
        
        
    

        // BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);

        // System.out.println(groceries.toString());

        // while(scan.hasNextLine()) {
            // String category = scan.nextLine();

            // double limit = scan.nextDouble();
            // double spent = scan.nextDouble();

            // //Consume \n after spent input 
            // if(scan.hasNextLine()) scan.nextLine();

            // String limitString = String.format("$%.2f", limit);
            // String spentString = String.format("$%.2f", spent);
            // System.out.println("The budget limit for " + category + " was: " + limitString + 
            //                    " but the actual spend was " + spentString);
        
    


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
    // public static int budgetDifference(List<BudgetCategory> categories) {
    //     // TODO: You will implement this method in Wave 5
    //     // Note that this method SHOULD NOT have a print statement.
    //     // It should instead return the value.
    //     return -1;
    // }

