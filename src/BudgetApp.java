import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class BudgetApp {
    public static void main(String[] args) throws FileNotFoundException {
        /**BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);
        System.out.println(groceries);

        BudgetCategory rent = new BudgetCategory("Rent", 1000, 950);
        System.out.println(rent);**/

        String filename = args[0];
        Scanner scan = new Scanner(new File(filename));

        List<BudgetCategory> categories = new ArrayList<>();

        while(scan.hasNextLine()) {
            String category = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            // Consume \n after spent input 
            if(scan.hasNextLine()) scan.nextLine();

            String limitString = String.format("$%.2f", limit);
            String spentString = String.format("$%.2f", spent);
            BudgetCategory budgetCategory = new BudgetCategory(category, limit, spent);
            categories.add(budgetCategory);
        }

        // Sort from most to least overspent category
        Collections.sort(categories, Collections.reverseOrder());

        for (BudgetCategory bc : categories) {
            System.out.println(bc);
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
