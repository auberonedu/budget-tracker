import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BudgetCategoryTest {

    @Test
    void testToString() {
        // Arrange
        BudgetCategory category = new BudgetCategory("Groceries", 500.00, 401.00,);

        // Act
        String actual = category.toString();

        // Assert 
        String expected = "Category: Groceries, Limit: $500.0, Actual: $401.0, Difference: $50.0";
        assertEquals(expected, actual);
    }

    @Test
    void testCompareToSameDiff() {
        //Arrange
        BudgetCategory groceries = new BudgetCategory("Groceries", 500, 450); 
        BudgetCategory utilities = new BudgetCategory("Utilities", 300, 250); 

          // Act: Comparing the two categories
          int spending = groceries.compareTo(utilities);

          // Assert: 
          assertEquals(0, spending); 
      }
}