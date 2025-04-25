import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BudgetAppTest {
    
    @Test
    void testingToString() {
        String category = "Entertainment";
        double limit = 100.0;
        double spent = 50.0;
        
        BudgetCategory category2 = new BudgetCategory(category, limit, spent);
        String expected = category + " " + limit + " " + spent;

        String acutal = category2.toString();

        assertEquals(expected, acutal);
    }
}
