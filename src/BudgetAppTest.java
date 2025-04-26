import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class BudgetAppTest {

    @Test
    public void testToString() {
        BudgetCategory groceries = new BudgetCategory("groceries", 250, 200);
            String actual = "Category: groceries\n"
            + "Limit: 250.0\n"
            + "Actual: 200.0";
        assertEquals(actual, groceries.toString());
    }
    @Test
    public void testToStringWhenCategoryFieldIsBlank() {
        BudgetCategory groceries = new BudgetCategory("", 0.0, 0.0);
            String actual ="Category: \n"
            + "Limit: 0.0\n"
            + "Actual: 0.0";
        assertEquals(actual, groceries.toString());
    }
}

