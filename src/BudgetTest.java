import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BudgetTest {
    @Test
    public void testDescribeTotalLimit() {
        // Arrange
        Budget budget = new Budget();
        budget.add(new BudgetCategory("Rent", 1500.0, 1500.0));
        budget.add(new BudgetCategory("Entertainment", 500.0, 500.0));
        double totalLimit = budget.totalLimit();

        // Act
        double actual = 1500.0 + 500.0;

        // Assert
        assertEquals(totalLimit, actual, 0.0001);
    }

    @Test
    public void testDescribeTotalLimitWithNoCategory() {
        // Arrange
        Budget budget = new Budget();
        double totalLimit = budget.totalLimit();

        // Act
        double actual = 0.0;

        // Assert
        assertEquals(totalLimit, actual, 0.0001);
    }

    @Test
    public void testDescribeTotalSpent() {
        // Arrange
        Budget budget = new Budget();
        budget.add(new BudgetCategory("Rent", 1500.0, 1500.0));
        budget.add(new BudgetCategory("Entertainment", 500.0, 500.0));
        double totalSpent = budget.totalSpent();

        // Act
        double actual = 1500.0 + 500.0;

        // Assert
        assertEquals(totalSpent, actual, 0.0001);
    }

    @Test
    public void testDescribeTotalSpentWithNoCategory() {
        // Arrange
        Budget budget = new Budget();
        double totalSpent = budget.totalSpent();

        // Act
        double actual = 0.0;

        // Assert
        assertEquals(totalSpent, actual, 0.0001);
    }

    @Test
    public void testDescribeRemainderOverBudget() {
        // Arrange
        Budget budget = new Budget();
        budget.add(new BudgetCategory("Rent", 1500.0, 1500.0));
        budget.add(new BudgetCategory("Entertainment", 500.0, 700.0));
        double remainder = budget.remainder();

        // Act
        double actual = (1500 + 500) - (1500 + 700);

        // Assert
        assertEquals(remainder, actual, 0.0001);
    }

    @Test
    public void testDescribeRemainderUnderBudget() {
        // Arrange
        Budget budget = new Budget();
        budget.add(new BudgetCategory("Rent", 1500.0, 1500.0));
        budget.add(new BudgetCategory("Entertainment", 500.0, 300.0));
        double remainder = budget.remainder();

        // Act
        double actual = (1500 + 500) - (1500 + 300);

        // Assert
        assertEquals(remainder, actual, 0.0001);
    }

    @Test
    public void testDescribeRemainderEqualsBudget() {
        // Arrange
        Budget budget = new Budget();
        budget.add(new BudgetCategory("Rent", 1500.0, 1500.0));
        budget.add(new BudgetCategory("Entertainment", 500.0, 500.0));
        double remainder = budget.remainder();

        // Act
        double actual = (1500 + 500) - (1500 + 500);

        // Assert
        assertEquals(remainder, actual, 0.0001);
    }
}
