import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class BudgetAppTest {
    @Test
    void testDescribeBudgetCategoryToString() {
        // Arrange
        String string = "BudgetCategory : Groceries, limit=500.0, spending=401.0";
        BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);
        
        // Act
        String actual = groceries.toString();
        
        // Assert
        assertEquals(string, actual);
    }

    @Test
    void testDescribeBudgetSavingsPositive() {
        // Arrange
        BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);
        BudgetCategory tvShowSub = new BudgetCategory("TVShowSubscription", 100, 100);

        // Act
        int actual = groceries.compareTo(tvShowSub);

        // Assert
        assertEquals(1, actual);
    }

    @Test
    void testDescribeBudgetSavingsNegative() {
        // Arrange
        BudgetCategory rent = new BudgetCategory("Rent", 1500, 1500);
        BudgetCategory tvShowSub = new BudgetCategory("TVShowSubscription", 100, 80);

        // Act
        int actual = rent.compareTo(tvShowSub);

        // Assert
        assertEquals(-1, actual);
    }

    @Test
    void testDescribeBudgetSavingsAreZero() {
        // Arrange
        BudgetCategory utilities = new BudgetCategory("Utilities", 350, 270);
        BudgetCategory transportation = new BudgetCategory("Transportation", 500, 420);

        // Act
        int actual = utilities.compareTo(transportation);

        // Assert
        assertEquals(0, actual);
    }

    @Test
    void testDescribeBudgetDifferenceIsPositive() {
        // Arrange
        List<BudgetCategory> myBudgetList = new ArrayList<>();
        myBudgetList.add(new BudgetCategory("Entertainment", 200, 180));
        myBudgetList.add(new BudgetCategory("Groceries", 500, 550));
        myBudgetList.add(new BudgetCategory("Rent", 1500, 1550));

        // Act
        int actual = BudgetApp.budgetDifference(myBudgetList);

        // Assert
        assertEquals(1, actual);
    }
}
