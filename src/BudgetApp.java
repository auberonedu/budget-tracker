import java.util.List;
import java.util.Scanner;

public class BudgetApp {
    public static void main(String[] args) {

        // Wave 1:
        // Variables
        BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);
        BudgetCategory rent = new BudgetCategory("Rent", 1350, 1350);
        BudgetCategory diningOut = new BudgetCategory("Dining Out", 120, 185);
        BudgetCategory transportation = new BudgetCategory("Transportation", 200, 190);
        BudgetCategory entertainment = new BudgetCategory("Entertainment", 150, 165);
        BudgetCategory utilites = new BudgetCategory("Utilities", 150, 165);
        
        // Call out getters and toString
        //for groceries
        System.out.println(groceries);
        System.out.println(groceries.toString());
        System.out.println("Groceries limit: " + groceries.getLimit());

        // for rent
        System.out.println(rent);
        System.out.println(rent.toString());
        System.out.println("Rent spent: " + rent.getSpent());

        
        // Scanner scan = new Scanner(System.in);

        // while(scan.hasNextLine()) {
        //     String category = scan.nextLine();

        //     // Limit comes first, then spending
        //     double limit = scan.nextDouble();
        //     double spent = scan.nextDouble();

        //     // Consume \n after spent input 
        //     if(scan.hasNextLine()) scan.nextLine();

            // String limitString = String.format("$%.2f", limit);
            // String spentString = String.format("$%.2f", spent);
            // System.out.println("The budget limit for " + category + " was: " + limitString + 
            //                    " but the actual spend was " + spentString);
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
    // public static int budgetDifference(List<BudgetCategory> categories) {
    //     // TODO: You will implement this method in Wave 5
    //     // Note that this method SHOULD NOT have a print statement.
    //     // It should instead return the value.
    //     return -1;
    // }
//}
