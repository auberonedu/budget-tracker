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
}