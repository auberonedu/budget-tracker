import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BudgetAppTest {
    @Test
    void testToString(){
        //Arrange
        BudgetCategory budget = new BudgetCategory("Food", 400, 500);

        //Act
        String actual = budget.toString();

        //Assert
        String expected = "Category: Food" + "\nlimit: 400.0" + "\nspent: 500.0";
        assertEquals(expected, actual);
    }
}
