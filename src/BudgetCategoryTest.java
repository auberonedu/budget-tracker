import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BudgetCategoryTest {
    @Test
    public void testCompareToWithUnderToOverBudget() {
        BudgetCategory overBudget = new BudgetCategory("groceries", 180, 200);
        BudgetCategory underBudget = new BudgetCategory("groceries", 180, 160);
        assertTrue(underBudget.compareTo(overBudget) < 0);
        assertEquals(-1, underBudget.compareTo(overBudget));
    }
    @Test
    public void testCompareToWithOverToUnderBudget() {
        BudgetCategory overBudget = new BudgetCategory("groceries", 180, 190);
        BudgetCategory underBudget = new BudgetCategory("groceries", 180, 160);
        assertTrue(overBudget.compareTo(underBudget) > 0);
        assertEquals(1, overBudget.compareTo(underBudget));
    }
    @Test
    public void testCompareToWhenEqual() {
        BudgetCategory januaryBudget = new BudgetCategory("groceries", 180, 180);
        BudgetCategory februaryBudget = new BudgetCategory("groceries", 180, 180);
        assertTrue(januaryBudget.compareTo(februaryBudget) == 0);
        assertEquals(0, januaryBudget.compareTo(februaryBudget));
    }
    @Test
    public void testLimitPerformanceWhenOver() {
        BudgetCategory overBudget = new BudgetCategory("groceries", 180, 200);
        assertEquals(20, overBudget.limitPerformance());
    }
    @Test
    public void testLimitPerformanceWhenUnder() {
        BudgetCategory underBudget = new BudgetCategory("groceries", 180, 160);
        assertEquals(-20, underBudget.limitPerformance());
    }
    @Test
    public void testConstructor() {
        BudgetCategory eggs = new BudgetCategory("eggs", 8, 7);
        assertEquals("eggs", eggs.getCategory());
        assertEquals(8, eggs.getLimit());
        assertEquals(7, eggs.getActual());
    }
    @Test
    public void testContructor2() {
        BudgetCategory groceries = new BudgetCategory("groceries", 250, 225);
        assertEquals("groceries", groceries.getCategory());
        assertEquals(250, groceries.getLimit());
        assertEquals(225, groceries.getActual());
    }
    @Test
    public void testActualExpenditure() {
        BudgetCategory groceries = new BudgetCategory("groceries", 250, 200);
        assertEquals(200, groceries.getActual());
    }
    @Test
    public void testSetters() {
        BudgetCategory groceries = new BudgetCategory("groceries", 250, 200);
        groceries.setActual(180);
        assertEquals(180, groceries.getActual());
    }
}