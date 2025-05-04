import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BudgetTest {
    @Test
    public void testTotalLimit() {
        Budget budget = new Budget();
        BudgetCategory rent = new BudgetCategory("Rent", 1350.00, 1350.00);
        BudgetCategory groceries = new BudgetCategory("Groceries", 400.00, 375.00);
        budget.add(rent);
        budget.add(groceries);

        assertEquals(1750.00, budget.totalLimit());
    }
    @Test
    public void testTotalLimitWhenZero() {
        Budget budget = new Budget();
        BudgetCategory rent = new BudgetCategory("Rent", 0.0, 0.0);
        BudgetCategory groceries = new BudgetCategory("Groceries", 0.0, 0.0);
        budget.add(rent);
        budget.add(groceries);

        assertEquals(0.0, budget.totalLimit());
    }
    @Test
    public void testTotalWhenHashMapIsEmpty() {
        Budget budget = new Budget();

        assertEquals(0.0, budget.totalLimit());
    }
    @Test
    public void testTotalSpent() {
        Budget budget = new Budget();
        BudgetCategory rent = new BudgetCategory("Rent", 1350.00, 1350.00);
        BudgetCategory groceries = new BudgetCategory("Groceries", 400.00, 375.00);
        budget.add(rent);
        budget.add(groceries);

        assertEquals(1725.00, budget.totalSpent());
    }
    @Test
    public void testTotalSpentWhenZero() {
        Budget budget = new Budget();
        BudgetCategory rent = new BudgetCategory("Rent", 1350.00, 0.0);
        BudgetCategory groceries = new BudgetCategory("Groceries", 400.00, 0.0);
        budget.add(rent);
        budget.add(groceries);

        assertEquals(0.0, budget.totalSpent());
    }
    @Test
    public void testTotalSpentWhenHashMapIsEmpty() {
        Budget budget = new Budget();

        assertEquals(0.0, budget.totalSpent());
    }
    //Underbudget is represented by negative values
    @Test
    public void testRemainderWhenUnderBudget() {
        Budget budget = new Budget();
        BudgetCategory rent = new BudgetCategory("Rent", 1350.00, 1350.00);
        BudgetCategory groceries = new BudgetCategory("Groceries", 400.00, 375.00);
        budget.add(rent);
        budget.add(groceries);

        assertEquals(-25.00, budget.remainder());
    }
        //Overbudget is represented by positive values
        @Test
        public void testRemainderWhenOverBudget() {
            Budget budget = new Budget();
            BudgetCategory rent = new BudgetCategory("Rent", 1350.00, 1350.00);
            BudgetCategory groceries = new BudgetCategory("Groceries", 400.00, 425.00);
            budget.add(rent);
            budget.add(groceries);
    
            assertEquals(25.00, budget.remainder());
        }
    @Test
    public void testRemainderWhenZero() {
        Budget budget = new Budget();
        BudgetCategory rent = new BudgetCategory("Rent", 1350.00, 1350.00);
        BudgetCategory groceries = new BudgetCategory("Groceries", 400.00, 400.00);
        budget.add(rent);
        budget.add(groceries);

        assertEquals(0.0, budget.remainder());
    }
    @Test
    public void testRemainderWhenHashMapIsEmpty() {
        Budget budget = new Budget();

        assertEquals(0.0, budget.remainder());
    }
}
