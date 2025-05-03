import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BudgetApp {
    public static void main(String[] args) throws FileNotFoundException{
        //7. Modify BudgetApp so that it uses Budget and exposes its functionality to the user.
        Budget budget = new Budget();

        budget.add(new BudgetCategory("sushi", 100, 100000));
        budget.add(new BudgetCategory("games", 100, 200));
        budget.add(new BudgetCategory("merchandise", 100, 100));

        System.out.println("Total Limit: " + budget.totalLimit());
        System.out.println("Total Spent: " + budget.totalSpent());
        System.out.println("Remainder: " + budget.remainder());
        System.out.println();
      
        // Scanner scan = new Scanner(System.in);
        String filename = args[0];

        Scanner scan = new Scanner(new File(filename));
        List<BudgetCategory> budgetList = new ArrayList<>();
        Map<String, BudgetCategory> budgetMapList = new HashMap<>();

        while(scan.hasNextLine()) {
            String category = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            // Consume \n after spent input 
            if(scan.hasNextLine()) scan.nextLine();

            BudgetCategory budgetCategory = new BudgetCategory(category, limit, spent);
            
            budgetList.add(budgetCategory);
            budgetMapList.put(category, budgetCategory);

            String limitString = String.format("$%.2f", limit);
            String spentString = String.format("$%.2f", spent);
        }
        // BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);
        // System.out.println(groceries);

        // System.out.println(budgetList);

        //This is smallest to largest in the sense that it is the least underbudget not over
        // Collections.sort(budgetList, Collections.reverseOrder());

        // Collections.sort(budgetList);
        // System.out.println(budgetList);
        // System.out.println();
        // System.out.println("Overall over/under budget: " + budgetDifference(budgetList) +"$");

        Scanner budgetScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a category name: ");
            String catagoryName = budgetScanner.nextLine();
            
            BudgetCategory myCategory = budgetMapList.get(catagoryName);
            if(catagoryName.toLowerCase().equals("summary")){
                double totalLimit = 0;
                double totalSpent = 0;
                for (BudgetCategory budgetCategory : budgetList) {
                    totalLimit += budgetCategory.getLimit();
                    totalSpent += budgetCategory.getSpent();
                }
                System.out.println();
                System.out.println("Total limit: " + totalLimit);
                System.out.println("Total Spent: -" + totalSpent);
                System.out.println("You went overbudget by: " + budgetDifference(budgetList) +"$");
                System.out.println();
            } else{
                if (myCategory == null) {
                    System.out.println();;
                    System.out.println("No such category");
                }  else{
                    System.out.println();;
                    System.out.println(myCategory);
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
        int finalBudgetDifference = 0;
        for (BudgetCategory budgetCategory:categories) {
            finalBudgetDifference += budgetCategory.spentRatio();
        }
        return finalBudgetDifference;
    }
}
