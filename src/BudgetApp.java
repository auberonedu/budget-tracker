import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BudgetApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<BudgetCategory>categories = new ArrayList<>();

        while(scan.hasNextLine()) {
            String category = scan.nextLine();
            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            // Consume \n after spent input 
            if(scan.hasNextLine()) scan.nextLine();

            BudgetCategory a = new BudgetCategory(category, limit, spent);
            categories.add(a);

            //Reverse order
            categories.sort(Collections.reverseOrder());
        }
            for(BudgetCategory a: categories) {
                System.out.println(a);
            }

            //added but idk if neded for printing result from budgetDiff
            double diff = budgetDifference(categories);
            System.out.println("Budget difference: " + diff);

        }

    public static double budgetDifference(List<BudgetCategory> categories) {
        double totalDifference = 0;
        for (BudgetCategory a : categories) {
            totalDifference += a.getDiff(); 
        }
        return totalDifference;
    }

    @Override
    public String toString() {
        return "BudgetApp []";
    }
}

    
