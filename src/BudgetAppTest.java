import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
}
