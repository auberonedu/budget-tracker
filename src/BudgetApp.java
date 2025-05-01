import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class BudgetApp {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        String filename = args[0];

        Scanner scan = new Scanner(new File(filename));

        // BudgetCategory sample = new BudgetCategory("rent", 2000, 2200);

        // List<BudgetCategory> budgets = new ArrayList<>();

        Map<String, BudgetCategory> budgetsMap = new HashMap<>();

        //System.out.println(sample.toString());

        while(scan.hasNextLine()) {
            String category = scan.nextLine();
            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            BudgetCategory budget = new BudgetCategory(category, limit, spent);

            budgetsMap.put(category, budget);

            // Consume \n after spent input 
            if(scan.hasNextLine()) scan.nextLine();

            // String limitString = String.format("$%.2f", limit);
            // String spentString = String.format("$%.2f", spent);
            // System.out.println("The budget limit for " + category + " was: " + limitString + 
            //                    " but the actual spend was " + spentString);
        }

        Scanner uInput = new Scanner(System.in);

        while (true){
            System.out.print("Enter a category name: ");
            String askCat = uInput.nextLine();

            if (askCat.equals("quit")){
                break;
            } else if (askCat.equals("summary")){
                int limitSum = 0;
                int spentSum = 0;
                for (String cat : budgetsMap.keySet()){
                    limitSum += budgetsMap.get(cat).getLimit();
                    spentSum += budgetsMap.get(cat).getActual();
                }

                int budgetResult = limitSum - spentSum;

                if (budgetResult < 0){
                    System.out.println("Overbudget by " + Math.abs(budgetResult));
                } else {
                    System.out.println("Stayed within or under budget by " + budgetResult);
                }
            }



            if (budgetsMap.containsKey(askCat)){
                System.out.println(
                    "\nCategory: " + budgetsMap.get(askCat).getCategory() +
                    "\nLimit: " + budgetsMap.get(askCat).getLimit() +
                    "\nActual: " + budgetsMap.get(askCat).getActual()
                );
            } else {
                System.out.println("Budget category entered does not exist.");
            }

        }

        // System.out.println(budgets);
        // System.out.println();
        // Collections.sort(budgets, Collections.reverseOrder());
        // System.out.println("Least Overspent");
        // System.out.println(budgets);

        // System.out.println();
        // System.out.println("Most Overspent");
        // Collections.sort(budgets);
        // System.out.println(budgets);

        // System.out.println("this month we saved: " + budgetDifference(budgets));

        // System.out.println(budgets.get(0));

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

        for (BudgetCategory budget : categories){
            double save =  budget.getLimit() - budget.getActual();

            sum += save;
        }

        
        return sum;
    }
}
