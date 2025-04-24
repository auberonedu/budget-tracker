import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
}
