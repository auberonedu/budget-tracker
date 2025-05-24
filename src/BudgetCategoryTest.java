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
}
