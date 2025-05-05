import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BudgetApp {
    public static void main(String[] args) throws FileNotFoundException{

        String filename = args[0];
        Scanner scan = new Scanner(new File(filename));

        List<BudgetCategory> categories = new ArrayList<>();

        // Use a for loop for repeated input
        System.out.print("Enter category name (or 'done' to finish): ");
        String category = scan.nextLine();

        while (!category.equalsIgnoreCase("done")) {
            System.out.print("Enter limit for " + category + ": ");
            double limit = Double.parseDouble(scan.nextLine());
            System.out.println("Enter spent for "+ category+ ": ");
            double spent = Double.parseDouble(scan.nextLine());
            BudgetCategory c = new BudgetCategory(category, limit, spent);
            categories.add(c);

            System.out.print("Enter category name (or 'done' to finish): ");
            category = scan.nextLine();
        }

        // Print the categories using a for loop
        System.out.println(categories);
        
        
    

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
        return -1;
    }
}
