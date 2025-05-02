import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class BudgetAppTest {
    @Test
    public void testToString() {
        // Arrange
        BudgetCategory diningOut = new BudgetCategory("Dining Out", 120.00, 185.00);

        // Act
        String actual = diningOut.toString();

        // Assert
        String expected = "Category: Dining Out\nBudget: $120.0\nSpent: $185.0";
        assertEquals(expected, actual);
    }

    @Test
    public void testCompareToUnderVsOverBudget() {
        // Arrange
        BudgetCategory groceries = new BudgetCategory("Groceries", 500, 495);
        BudgetCategory eatingOut = new BudgetCategory("Eating Out", 100, 200);

        // Act
        int actual = groceries.compareTo(eatingOut);

        // Assert
        assertEquals(-1, actual);
    }

    @Test
    public void testCompareToUnderVsMoreUnderBudget() {
        // Arrange
        BudgetCategory groceries = new BudgetCategory("Groceries", 500, 495);
        BudgetCategory entertainment = new BudgetCategory("Entertainment", 80, 50);

        // Act
        int actual = groceries.compareTo(entertainment);

        // Assert
        assertEquals(1, actual);
    }

    @Test
    public void testCompareToEqualBudget() {
        // Arrange
        BudgetCategory rent1 = new BudgetCategory("Rent", 1000, 1000);
        BudgetCategory rent2 = new BudgetCategory("Rent", 1000, 1000);

        // Act
        int actual = rent1.compareTo(rent2);

        // Assert
        assertEquals(0, actual);
    }

    @Test
    public void testBudgetDifference_UnderBudget() {
        // Arrange
        List<BudgetCategory> list = new ArrayList<>();
        list.add(new BudgetCategory("Groceries", 500, 400)); // +100
        list.add(new BudgetCategory("Transport", 200, 150)); // +50

        // Act
        int actual = (int) BudgetApp.budgetDifference(list);

        // Assert
        assertEquals(150, actual);
    }
}
