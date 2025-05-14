import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BudgetCategoryTest {
    @Test
    public void compareToless(){
        BudgetCategory groceries = new BudgetCategory("Groceries", 400, 375);
        BudgetCategory dinningOut = new BudgetCategory("Dinning Out", 120, 185);

        int result = groceries.compareTo(dinningOut);
        assertEquals(-1, result, "We expect groceries less than Dinning out");

    }

    @Test
    public void compareToGreater(){
        BudgetCategory entertainment = new BudgetCategory("Entertainment", 80, 115);
        BudgetCategory utilities = new BudgetCategory("Utilities", 150, 165);

        int result = entertainment.compareTo(utilities);
        assertEquals(1, result, "We expect entertainment greater than utilities out");

    }
}
