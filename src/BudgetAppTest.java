import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BudgetAppTest {

  @Test
    public void testToString() {
        BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);

        String actual = groceries.toString();

        String expected = "Category: Groceries spent: 401.0 limit: 500.0";
        assertEquals(expected, actual);
    }

    
}
