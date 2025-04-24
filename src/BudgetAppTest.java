import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BudgetAppTest {
    @Test
    void testToString(){
        BudgetCategory testCat = new BudgetCategory("Vacation", 3000, 3300);

        String testString = "Category: Vacation\nLimit: 3000.0\nActual: 3300.0";
        
        String actual = testCat.toString();


        assertEquals(testString, actual);
    }
}
