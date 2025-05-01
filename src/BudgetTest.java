import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BudgetTest {
    @Test
    void testToString(){
        Budget budgets = new Budget();

        BudgetCategory vacation = new BudgetCategory("vacation", 3000, 3300);
        BudgetCategory rent = new BudgetCategory("Rent", 4000, 4000);
        BudgetCategory grocer = new BudgetCategory("Groceries", 1000, 800);

        budgets.addBudgetCategory(vacation.getCategory(), vacation);
        budgets.addBudgetCategory(rent.getCategory(), rent);
        budgets.addBudgetCategory(grocer.getCategory(), grocer);

        String testString = "Category: vacation\nLimit: 3000.0\nActual: 3300.0";
        
        String actual = testCat.toString();


        assertEquals(testString, actual);
    }
}
