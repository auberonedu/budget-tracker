import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
}
