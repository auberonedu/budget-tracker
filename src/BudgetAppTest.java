import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.hamcrest.internal.ArrayIterator;

public class BudgetAppTest {
    
    @Test
    void testingToString() {
        String category = "Entertainment";
        double limit = 100.0;
        double spent = 50.0;
        
        BudgetCategory category2 = new BudgetCategory(category, limit, spent);
        String expected = category + " " + limit + " " + spent;

        String actual = category2.toString();

        assertEquals(expected, actual);
    }
    @Test
    void compareToUnderBudget() {
        BudgetCategory groceries = new BudgetCategory("Groceries", 500, 490); // spent $10 under
        BudgetCategory diningOut = new BudgetCategory("Dining Out", 200, 300); // spent $100 over

        int actual = groceries.compareTo(diningOut);

        assertEquals(1, actual);

    }
    @Test
    void compareToOverBudget() {
        BudgetCategory entertainment = new BudgetCategory("Entertainment", 350, 450); // spent over $100
        BudgetCategory utilities = new BudgetCategory("utilities", 1000, 850); // under budegt limit by $250

        int actual = entertainment.compareTo(utilities);

        assertEquals(-1, actual);
    }
    @Test
    void compareToExactBudget() {
        BudgetCategory rent = new BudgetCategory("Rent", 1350, 1350); // all budget limit was met
        BudgetCategory transportation = new BudgetCategory("Transportation", 633, 633);

        int actual = rent.compareTo(transportation);

        assertEquals(0, actual);
    }
    @Test
    void budgetCheckerOverBudget() {
        BudgetCategory groceries = new BudgetCategory("Groceries", 500, 600); // spent over budget by $100
        BudgetCategory entertainment = new BudgetCategory("Entertainment", 100, 150); // spent under budget by $50
        BudgetCategory transportation = new BudgetCategory("Transportation", 600, 750); // spent under budget by $150
        List<BudgetCategory> categories = new ArrayList<>();
        categories.add(groceries);
        categories.add(entertainment);
        categories.add(transportation);

        int actual = BudgetApp.budgetDifference(categories);

        assertEquals(300,actual );
    }
    @Test 
    void budgetCheckerEven() {
        BudgetCategory rent = new BudgetCategory("Rent", 1300, 1300);
        BudgetCategory transportation = new BudgetCategory("Transportation", 600, 600);
    
        List<BudgetCategory> categories = new ArrayList<>();
        categories.add(rent);
        categories.add(transportation);

        int acutal = BudgetApp.budgetDifference(categories);

        assertEquals(0, acutal);
    }
    @Test
    void budgetCheckerUnderBudget() {
        BudgetCategory diningOut = new BudgetCategory("DiningOut", 300, 200); // spent under budget by $100
        BudgetCategory utilities = new BudgetCategory("Utilities", 1000, 700); // spent over budget by $300

        List<BudgetCategory> categories = new ArrayList<>();
        categories.add(diningOut);
        categories.add(utilities);

        int actual = BudgetApp.budgetDifference(categories);

        assertEquals(-400, actual);
    }
}
