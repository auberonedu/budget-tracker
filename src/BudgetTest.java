import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BudgetTest {
    @Test
    void checkingTotalLimit() {
        Budget budget = new Budget(); // empty obj
        budget.add(new BudgetCategory("Groceries", 500, 400)); // under budget $100
        budget.add(new BudgetCategory("Rent", 1500, 1500)); // balanced $0
        budget.add(new BudgetCategory("Entertainment", 350, 200)); // under budget by $150

        double actual = budget.totalLimit();

        assertEquals(2350.0, actual);

    }
    @Test 
    void checkingTotalSpent() {
        Budget budget = new Budget();
        budget.add(new BudgetCategory("Groceries", 500, 400)); // under budget $100
        budget.add(new BudgetCategory("Rent", 1500, 1500)); // balanced $0
        budget.add(new BudgetCategory("Entertainment", 350, 200)); // under budget by $150

        double actual = budget.totalSpent();

        assertEquals(2100, actual);
    }
    @Test
    void checkingRemainder() {
        Budget budget = new Budget();
        budget.add(new BudgetCategory("Groceries", 500, 400)); // under budget $100
        budget.add(new BudgetCategory("Rent", 1500, 1500)); // balanced $0
        budget.add(new BudgetCategory("Entertainment", 350, 200)); // under budget by $150

        double actual = budget.remainder();

        assertEquals(-250, actual);
    }

}