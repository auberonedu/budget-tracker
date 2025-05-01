import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BudgetTest {
    @Test
    void testTotalLimit(){
        Budget budgets = new Budget();

        BudgetCategory vacation = new BudgetCategory("vacation", 3000, 3300);
        BudgetCategory rent = new BudgetCategory("Rent", 4000, 4000);
        BudgetCategory grocer = new BudgetCategory("Groceries", 1000, 800);

        budgets.addBudgetCategory(vacation.getCategory(), vacation);
        budgets.addBudgetCategory(rent.getCategory(), rent);
        budgets.addBudgetCategory(grocer.getCategory(), grocer);

        double totalSpent = 8000.0;
        
        double actual = budgets.totalLimit();


        assertEquals(totalSpent, actual);
    }

    @Test
    void testTotalSpent(){
        Budget budgets = new Budget();

        BudgetCategory vacation = new BudgetCategory("vacation", 3000, 3000);
        BudgetCategory rent = new BudgetCategory("Rent", 4000, 4000);
        BudgetCategory grocer = new BudgetCategory("Groceries", 1000, 800);

        budgets.addBudgetCategory(vacation.getCategory(), vacation);
        budgets.addBudgetCategory(rent.getCategory(), rent);
        budgets.addBudgetCategory(grocer.getCategory(), grocer);

        double totalSpent = 7800.0;
        
        double actual = budgets.totalSpent();


        assertEquals(totalSpent, actual);
    }

    @Test
    void testRemainder(){
        Budget budgets = new Budget();

        BudgetCategory vacation = new BudgetCategory("vacation", 3000, 3000);
        BudgetCategory rent = new BudgetCategory("Rent", 4000, 4000);
        BudgetCategory grocer = new BudgetCategory("Groceries", 1000, 800);

        budgets.addBudgetCategory(vacation.getCategory(), vacation);
        budgets.addBudgetCategory(rent.getCategory(), rent);
        budgets.addBudgetCategory(grocer.getCategory(), grocer);

        double remainder = 200.0;
        
        double actual = budgets.budgetCheck();


        assertEquals(remainder, actual);
    }
}
