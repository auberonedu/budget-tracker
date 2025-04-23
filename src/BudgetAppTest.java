import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BudgetAppTest {  
@Test 
public void testToString() {
//Arrange
BudgetCategory category = new BudgetCategory("Groceries", 500, 401);
//Act
String actual = category.toString();
//Asssert
String expected = "500. 401 Groceries";
assertEquals(expected, actual);
    
}
}

