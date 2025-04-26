import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
}
