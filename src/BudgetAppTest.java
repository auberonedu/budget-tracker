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

    
  @Test
    public void testCompareToLessThan() {
        BudgetCategory groceries = new BudgetCategory("Groceries", 500, 400); 
        BudgetCategory entertainment = new BudgetCategory("Entertainment", 500, 600);
    
        int result = groceries.compareTo(entertainment);
        assertEquals(-1, result);
    }


  @Test
    public void testCompareToGreaterThan() {
        BudgetCategory groceries = new BudgetCategory("Groceries", 500, 600); 
        BudgetCategory entertainment = new BudgetCategory("Entertainment", 500, 400);
    
        int result = groceries.compareTo(entertainment);
        assertEquals(1, result);
    }

  @Test
    public void testCompareToEqual() {
        BudgetCategory groceries = new BudgetCategory("Groceries", 500, 500);
        BudgetCategory entertainment = new BudgetCategory("Entertainment", 500, 500); 
    
        int result = groceries.compareTo(entertainment);
        assertEquals(0, result);
    }

}
