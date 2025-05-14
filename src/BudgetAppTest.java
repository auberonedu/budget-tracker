import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BudgetAppTest {
    //Test toString 
    @Test
    public void testToString() {
        BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);

        String actual = groceries.toString();

        String expected = "Groceries : Budget Limit $500.00, Spent $401.00";
        assertEquals(expected, actual, "toString method did not return expected output!");
    }
    
}
