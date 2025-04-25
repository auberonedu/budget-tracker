import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BudgetApp {
    public static void main(String[] args) {

        // Wave 1:
        // Variables
        // BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);
        // BudgetCategory rent = new BudgetCategory("Rent", 1350, 1350);
        // BudgetCategory diningOut = new BudgetCategory("Dining Out", 120, 185);
        // BudgetCategory transportation = new BudgetCategory("Transportation", 200, 190);
        // BudgetCategory entertainment = new BudgetCategory("Entertainment", 150, 165);
        // BudgetCategory utilities = new BudgetCategory("Utilities", 150, 165);
        
        // Call out getters and toString
        //for groceries
        // System.out.println(groceries);
        // System.out.println(groceries.toString());
        // System.out.println("Groceries limit: " + groceries.getLimit());

        // // for rent
        // System.out.println(rent);
        // System.out.println(rent.toString());
        // System.out.println("Rent spent: " + rent.getSpent());

        // Wave 3
        Scanner scan = new Scanner(System.in);

        // Create a list of BudgetCategory
        List <BudgetCategory> budgetList = new ArrayList<>();

        while(scan.hasNextLine()) {
            String category = scan.nextLine();

            // Limit comes first, then spending
            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            // Consume \n after spent input 
            if(scan.hasNextLine()) scan.nextLine();

            // Add each of the categories scanned in the loop
            budgetList.add(new BudgetCategory(category, limit, spent));

            // String limitString = String.format("$%.2f", limit);
            // String spentString = String.format("$%.2f", spent);

            
            
        }
            // From my understanding, the Most overspent will be what we spent minus limit. For example:
            // Dining out limit: 120, spent: 185. -> Overspent: 65. 
            // -> This will be the first number to be displayed as first.
            // -> After testing with print statement, I figured that I don't need to use Collections.reverseOrder().
            Collections.sort(budgetList);

            // Print out the whole list by using for each loop
            System.out.println("Categories List Most Overspent to Least:");
            for (BudgetCategory eachCategory : budgetList){
                System.out.println(eachCategory);
        }

    
        double totalDifferent = budgetDifference(budgetList);
        if (totalDifferent > 0){
            System.out.println("You're OVER budget" + totalDifferent);
        }
        else if (totalDifferent < 0){
            System.out.println("You're UNDER budget. Good job!" + totalDifferent);
        }
        else {System.out.println("You're okay for making 0 balance.");}
    
    
    }

    /**
     * Returns overall how much over/under budget a person is given a list of their
     * categories.
     * 
     * This should be the sum of how much over/under budget each individual category is.
     * 
     * If the person is under budget, the result will be negative. If they are over budget, the result will be positive.
     * 
     * @param categories the budget categories with the spend
     * @return the total amount over/under budget
     */
    public static double budgetDifference(List<BudgetCategory> categories) {
        // TODO: You will implement this method in Wave 5
        // Note that this method SHOULD NOT have a print statement.
        // It should instead return the value.

        double totalDifferent = 0;
        for (BudgetCategory eachCategory : categories){
            totalDifferent += eachCategory.differences();
    }
        return totalDifferent;
    }

}

