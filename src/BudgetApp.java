import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Locale.Category;

import org.junit.experimental.categories.Categories;

public class BudgetApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<BudgetCategory> categories = new ArrayList<>();


            while(scan.hasNextLine()) {

            String category = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            BudgetCategory budgetCategory = new BudgetCategory(category, limit, spent);
            categories.add(budgetCategory);

            // Consume \n after spent input 
            if(scan.hasNextLine()) scan.nextLine();

            String limitString = String.format("$%.2f", limit);
            String spentString = String.format("$%.2f", spent);
            }
            scan.close();
            System.out.println("---Sorted---");
            Collections.sort(categories, Collections.reverseOrder());
            System.out.println(categories);

            Collections.sort(categories);
            System.out.println(categories);
            System.out.println(budgetDifference(categories));
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

