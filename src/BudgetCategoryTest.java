import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BudgetCategoryTest {
    @Test
    public void testTwoString(){
    BudgetCategory t2s = new BudgetCategory("groceries",500.00,401.00);
    
    String results = t2s.toString();

    assertEquals("groceries 401.0 500.0", results);
    }

    @Test
    public void testUnderCompareTo(){
        BudgetCategory groceries = new BudgetCategory("groceries",500.00, 249);
        BudgetCategory rent = new BudgetCategory("Rent", 2500, 1500);

        int results = groceries.compareTo(rent);

        assertEquals(1,results);
    }
    @Test

    public void testIfEqual () {
        BudgetCategory sameDifference1 = new BudgetCategory("groceries", 600, 50);    
        BudgetCategory sameDifference2 = new BudgetCategory("car", 600, 50);
    
        int results = sameDifference1.compareTo(sameDifference2);

        assertEquals(0, results);
    }
    @Test
    public void testOverBudget (){
        BudgetCategory groceries = new BudgetCategory("Groceries", 100, 300);
        BudgetCategory bills = new BudgetCategory("Bills", 1500, 1501);

        int results = groceries.compareTo(bills);

        assertEquals(1, results); 

    }
}
