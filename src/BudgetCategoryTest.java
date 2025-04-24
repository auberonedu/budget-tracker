import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BudgetCategoryTest {

    @Test
    void testToString() {
        // Arrange
        BudgetCategory category = new BudgetCategory("Groceries", 500.00, 401.00);

        // Act
        String actual = category.toString();

        // Assert 
        String expected = "Category: Groceries, Limit: $500.0, Actual: $401.0, Difference: $50.0";
        assertEquals(expected, actual);
    }


    @Test
    void testCompareToOverUnder() {
        // Arrange: One category is over budget, one is under budget
        BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401); 
        BudgetCategory entertainment = new BudgetCategory("Entertainment", 300, 280); 

        // Act: Compare the two categories
        int actual = groceries.compareTo(entertainment);

        // Assert: 
        assertEquals(1,actual); 
    }

    @Test
    void testCompareToSameDiff() {
        //Arrange
        BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401); 
        BudgetCategory utilities = new BudgetCategory("Utilities", 300, 250); 

          // Act: Comparing the two categories
          int spent = groceries.compareTo(utilities);

          // Assert: 
          assertEquals(0, spent); 
      }

      @Test
    void testCompareToDifferentDiff() {
        // Arrange: 
        BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401); 
        BudgetCategory eatingOut = new BudgetCategory("EatingOut", 100, 120); 

        // Act: Compare the two categories
        int actual = groceries.compareTo(eatingOut);

        // Assert: 
        assertTrue(actual < 0); 
    }
}