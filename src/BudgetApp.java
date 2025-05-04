import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;

public class BudgetApp {
    public static void main(String[] args) throws FileNotFoundException {

        String filename = args[0];
        Scanner scanFile = new Scanner(new File(filename));

        Map<String, BudgetCategory> budgets = new HashMap<>();

        //BudgetCategory electronics = new BudgetCategory("tablet", 500, 200);
        //System.out.println(electronics.toString());
        
        while(scanFile.hasNextLine()) {
            String category = scanFile.nextLine().toUpperCase();
            double limit = scanFile.nextDouble();
            double actual = scanFile.nextDouble();
            
            BudgetCategory budgetCategory = new BudgetCategory(category, limit, actual);
            
            budgets.put(category, budgetCategory);
            
            if (scanFile.hasNextLine()) {
                scanFile.nextLine();
            }
        }
        scanFile.close();     
        
                Scanner scanner = new Scanner(System.in);
        
        while(true) {

            System.out.println("Enter a category from your budget: ");
            String userInput = scanner.nextLine().toUpperCase();
        
        if (userInput.equalsIgnoreCase("quit")) {
            System.out.println("This month's budget difference was " + budgetDifference(budgets) + " dollar(s).");
            System.out.println("Application is closing... \nSee you next time!");
            break;
        }
        if (budgets.containsKey(userInput)) {
            System.out.println("Category: " + userInput);
            System.out.println("Budget goal: " + budgets.get(userInput).getLimit());
            System.out.println("Spent: " + budgets.get(userInput).getActual());
        } else {
            System.out.println("category: " + userInput + " does not exist.");
        }
    }
        scanner.close();
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

        for (BudgetCategory budget : categories) {
            double save =  budget.getActual() - budget.getLimit();
            sum += save;
        }
        return sum;
    }
}


