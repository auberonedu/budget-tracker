import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class BudgetAppTest {
    @Test
    public void testBudgetCategoryToString() {
        // Arrange
        BudgetCategory category = new BudgetCategory("Entertainment", 300.0, 500.0);
        // Act
        String actual = category.toString();
        // Assert
        String expected = "Entertainment 300.0 500.0";
        assertEquals(expected, actual);
    }

    @Test
    public void testCompareToLessThan() {
        //Arrange
        BudgetCategory entertainment = new BudgetCategory("Entertainment", 300.0, 250.0);
        BudgetCategory eatingOut = new BudgetCategory("Eating Out", 200.0, 250.0);
        //Act
        int actual = entertainment.compareTo(eatingOut);
        //Assert
        assertEquals(-1, actual);
    }

    @Test
    public void testCompareToGreaterThan() {
        // Arrange
        BudgetCategory eatingOut = new BudgetCategory("Eating Out", 200.0, 250.0);
        BudgetCategory groceries = new BudgetCategory("Groceries", 500.0, 450.0);

        // Act
        int actual = eatingOut.compareTo(groceries);

        // Assert
        assertEquals(1, actual);
    }

    @Test
    public void testCompareToEqual() {
        // Arrange
        BudgetCategory groceries1 = new BudgetCategory("Groceries", 500.0, 450.0);
        BudgetCategory groceries2 = new BudgetCategory("Groceries", 300.0, 250.0);

        // Act
        int actual = groceries1.compareTo(groceries2);

        // Assert
        assertEquals(0, actual);
    }

     @Test
    public void testBudgetDifferenceAllUnderBudget() {
        // Arrange
        List<BudgetCategory> categories = new ArrayList<>();
        categories.add(new BudgetCategory("Groceries", 500.0, 450.0));
        categories.add(new BudgetCategory("Entertainment", 300.0, 250.0));

        // Act
        int actual = BudgetApp.budgetDifference(categories);

        // Assert
        assertEquals(-100, actual);
    }

    @Test
    public void testBudgetDifferenceMixed() {
        // Arrange
        List<BudgetCategory> categories = new ArrayList<>();
        categories.add(new BudgetCategory("Groceries", 500.0, 550.0));
        categories.add(new BudgetCategory("Entertainment", 300.0, 250.0));

        // Act
        int actual = BudgetApp.budgetDifference(categories);

        // Assert
        assertEquals(0, actual);
    }

    @Test
    public void testBudgetDifferenceAllOverBudget() {
        // Arrange
        List<BudgetCategory> categories = new ArrayList<>();
        categories.add(new BudgetCategory("Dining", 200.0, 300.0));
        categories.add(new BudgetCategory("Rent", 1000.0, 1050.0));

        // Act
        int actual = BudgetApp.budgetDifference(categories);

        // Assert
        assertEquals(150, actual);
    }
}