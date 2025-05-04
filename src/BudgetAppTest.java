/*
// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.*;

// import java.util.ArrayList;
// import java.util.List;

// public class BudgetAppTest {
//     @Test
//     public void testBudgetDifference() {
//         List<BudgetCategory> categories = new ArrayList<>();
//         categories.add(new BudgetCategory("coffee", 1000, 999));
//         categories.add(new BudgetCategory("subscriptions", 100, 199));
//         categories.add(new BudgetCategory("travel", 1000, 1200));
//         int actual = BudgetApp.budgetDifference(categories);
//         assertEquals(298, actual);
//     }
//     @Test
//     public void testBudgetDifferenceWhenArrayListIsEmpty() {
//         List<BudgetCategory> categories = new ArrayList<>();
//         int actual = BudgetApp.budgetDifference(categories);
//         assertEquals(0.0, actual);
//     }
//     @Test
//     public void testBudgetDifferenceWhenNegativeLimit() {
//         List<BudgetCategory> categories = new ArrayList<>();
//         categories.add(new BudgetCategory("coffee", -1000, 999));
//         categories.add(new BudgetCategory("subscriptions", -100, 199));
//         categories.add(new BudgetCategory("travel", -1000, 1200));
//         int actual = BudgetApp.budgetDifference(categories);
//         assertEquals(4498, actual);
//     }
//     @Test
//     public void testBudgetDifferenceWhenActualIsNegative() {
//         List<BudgetCategory> categories = new ArrayList<>();
//         categories.add(new BudgetCategory("coffee", 0, -999));
//         categories.add(new BudgetCategory("subscriptions", 0, -199));
//         categories.add(new BudgetCategory("travel", 0, -1200));
//         int actual = BudgetApp.budgetDifference(categories);
//         assertEquals(-2398, actual);
//     }
//     @Test
//     public void testToString() {
//         BudgetCategory groceries = new BudgetCategory("groceries", 250, 200);
//             String actual = "Category: groceries\n"
//             + "Limit: 250.0\n"
//             + "Actual: 200.0";
//         assertEquals(actual, groceries.toString());
//     }
//     @Test
//     public void testToStringWhenCategoryFieldIsBlank() {
//         BudgetCategory groceries = new BudgetCategory("", 0.0, 0.0);
//             String actual ="Category: \n"
//             + "Limit: 0.0\n"
//             + "Actual: 0.0";
//         assertEquals(actual, groceries.toString());
//     }
//}
*/