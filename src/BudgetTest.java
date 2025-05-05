import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BudgetTest {
    @Test
    public void testTotalLimit() {
        // Arrange
        Budget budget = new Budget();
        budget.add(new BudgetCategory("Groceries", 500.0, 450.0));
        budget.add(new BudgetCategory("Rent", 1350.0, 1000.0));
        // Act
        double result = budget.totalLimit();
        // Assert
        assertEquals(1850.0, result, 0.01);
    }

    @Test
    public void testTotalSpent() {
        // Arrange
        Budget budget = new Budget();
        budget.add(new BudgetCategory("Dining", 200.0, 300.0));
        budget.add(new BudgetCategory("Utilities", 150.0, 120.0));
        // Act
        double result = budget.totalSpent();
        // Assert
        assertEquals(420.0, result, 0.01);
    }

    @Test
    public void testRemainderUnderBudget() {
        // Arrange
        Budget budget = new Budget();
        budget.add(new BudgetCategory("Entertainment", 300.0, 250.0));
        budget.add(new BudgetCategory("Transport", 200.0, 150.0));
        // Act
        double result = budget.remainder();
        // Assert
        assertEquals(100.0, result, 0.01);
    }

    @Test
    public void testRemainderOverBudget() {
        // Arrange
        Budget budget = new Budget();
        budget.add(new BudgetCategory("Shopping", 400.0, 600.0));
        budget.add(new BudgetCategory("Dining", 100.0, 200.0));
        // Act
        double result = budget.remainder();
        // Assert
        assertEquals(-300.0, result, 0.01);
    }

    @Test
    public void testRemainderOnBudget() {
        // Arrange
        Budget budget = new Budget();
        budget.add(new BudgetCategory("Books", 100.0, 50.0));
        budget.add(new BudgetCategory("Snacks", 150.0, 200.0));
        // Act
        double result = budget.remainder();
        // Assert
        assertEquals(0.0, result, 0.01);
    }
}
