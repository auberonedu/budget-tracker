import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BudgetAppTest {
    @Test
    void toStringTrue(){
        BudgetCategory groceries = new BudgetCategory("Groceries", 200, 50);

        String actual = groceries.toString();

        String expected = "Groceries 200.0 50.0";

        assertEquals(expected, actual);

    }
    
}
