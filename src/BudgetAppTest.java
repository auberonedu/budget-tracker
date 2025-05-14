import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class BudgetAppTest {
    //Test toString 
    @Test
    public void testToString() {
        BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);

        String actual = groceries.toString();

        String expected = "Groceries : Budget Limit $500.00, Spent $401.00";
        assertEquals(expected, actual, "toString method did not return expected output!");
    }

     @Test
    public void BudgetDifferenceUnderBudget() {
        List<BudgetCategory> categories = Arrays.asList(
            new BudgetCategory("Groceries", 400, 375), 
            new BudgetCategory("Entertainment", 80, 50) 
        );
        assertEquals(-55.00, BudgetApp.budgetDifference(categories), 0.01);
    }

    @Test
    public void testBudgetDifference_OverBudget() {
        List<BudgetCategory> categories = Arrays.asList(
            new BudgetCategory("Dining Out", 120, 185), 
            new BudgetCategory("Utilities", 150, 165) 
        );
        assertEquals(80.00, BudgetApp.budgetDifference(categories), 0.01);
    }

    @Test
    public void testBudgetDifference_ExactBudget() {
        List<BudgetCategory> categories = Arrays.asList(
            new BudgetCategory("Rent", 1350, 1350) 
        );
        assertEquals(0.00, BudgetApp.budgetDifference(categories), 0.01);
    }

}
