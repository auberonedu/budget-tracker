
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BudgetTest {
    @Test
    void LimitTesting(){
        // Arrange
        Budget limitTest = new Budget();
        
        // Act
        limitTest.add(new BudgetCategory("Rent", 2500, 3000));
        double expected = 2500;
        double actual = limitTest.totalLimit();

        // Assert
        assertEquals(expected, actual);

    }
    
}
