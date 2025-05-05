import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BudgetTest {

    @Test
    public void testTotalLimit() {
        Budget budget = new Budget();
        budget.add(new BudgetCategory("Groceries", 400, 350));
        budget.add(new BudgetCategory("Rent", 1200, 1200));

        assertEquals(1600.0, budget.totalLimit(), 0.001);
    }

    @Test
    public void testTotalSpent() {
        Budget budget = new Budget();
        budget.add(new BudgetCategory("Entertainment", 100, 120));
        budget.add(new BudgetCategory("Utilities", 150, 130));

        assertEquals(250.0, budget.totalSpent(), 0.001);
    }

    @Test
    public void testRemainder() {
        Budget budget = new Budget();
        budget.add(new BudgetCategory("Dining", 200, 180));
        budget.add(new BudgetCategory("Gas", 100, 120));

        assertEquals(0.0, budget.remainder(), 0.001); // (200+100) - (180+120) = 0
    }
}
