import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Locale.Category;
import java.io.File;
import java.io.FileNotFoundException;

public class BudgetApp {
    public static void main(String[] args) throws FileNotFoundException {

        Budget budget = new Budget();

        String fileName = args [0];
        Scanner scan = new Scanner (new File(fileName));

        Map<String, BudgetCategory> categories = new HashMap<>();

        double totalBudgetLimit = 0.0;
        double totalAmountSpent = 0.0;

        while(scan.hasNextLine()) {
            String category = scan.nextLine();
            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            if(scan.hasNextLine()) scan.nextLine();

            BudgetCategory userCategory = new BudgetCategory(category, limit, spent);
            budget.add(userCategory);

            System.out.println("Category: " + category +" "+ " Limit: " + limit + " Spent: " + spent);
        }

        Scanner userScanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a category (or 'summary' or 'quit'): ");
            String categoryName = userScanner.nextLine();

            if(categoryName.equalsIgnoreCase("quit")) {
                break;

            } else if(categoryName.equalsIgnoreCase("summary")) {
                double amountDifference = budget.totalSpent() - budget.totalLimit();
                if(amountDifference > 0) {
                    System.out.println("You are under budget by: $" + amountDifference);
                } else if(amountDifference < 0) {
                    System.out.println("You are over budget by: $" + amountDifference);
                } else {
                    System.out.println("You are exactly on budget");
                }
            } else {
                BudgetCategory category = budget.get(categoryName);
            if(category == null) {
                System.out.println("(Category not found!) Please enter a category: ");
            } else {
                System.out.println(category);
                 }
            }
        }
        
        // List<BudgetCategory> categories = new ArrayList<>();

        //     while(scan.hasNextLine()) {

        //     String category = scan.nextLine();
        //     double limit = scan.nextDouble();
        //     double spent = scan.nextDouble();

        //     BudgetCategory budgetCategory = new BudgetCategory(category, limit, spent);
        //     categories.add(budgetCategory);
        //     System.out.println(budgetCategory);

        //     // Consume \n after spent input 
        //     if(scan.hasNextLine()) scan.nextLine();

        //     String limitString = String.format("$%.2f", limit);
        //     String spentString = String.format("$%.2f", spent);
        //     }
        //     scan.close();
        //     System.out.println("---Original---");
        //     System.out.println(categories);
        //     // // sorting
        //     Collections.sort(categories, Collections.reverseOrder());

        //     System.out.println("---Sorted---");
        //     Collections.sort(categories); // the confirmed sorted from the reverse order
        //     System.out.println(categories);

        //     // prints out the total sum of each category 
        //     System.out.println(budgetDifference(categories));
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
        int sum = 0;
        for(BudgetCategory category : categories) {
             double spent = (category.getSpent() - category.getLimit());
             sum += spent;
        }
        return sum;
    }
}

