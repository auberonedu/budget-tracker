
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

    @Test
    void SpentTesting(){
        // Arrange
        Budget spentTest = new Budget();
        
        // Act
        spentTest.add(new BudgetCategory("Rent", 2500, 3000));
        double expected = 3000;
        double actual = spentTest.totalSpent();

        // Assert
        assertEquals(expected, actual);

    }

    @Test
    void RemainderTesting(){
        // Arrange
        Budget remainderTest = new Budget();
        
        // Act
        remainderTest.add(new BudgetCategory("Rent", 2500, 3000));
        double expected = -500;
        double actual = remainderTest.remainder();

        // Assert
        assertEquals(expected, actual);

    }

    @Test
    void MultipleCategoriesTesting(){
        // Arrange
        Budget test = new Budget();
        
        // Act
        test.add(new BudgetCategory("Rent", 2500, 3000));
        test.add(new BudgetCategory("groceries", 500, 300));
        test.add(new BudgetCategory("entertainment", 300, 185));

        double totalLimitExpected = 3300;
        double totalLimitActual = test.totalLimit();

        double totalSpentExpected = 3485;
        double totalSpentActual = test.totalSpent();

        double remainderExpected = totalLimitExpected - totalSpentExpected;
        double remainderActual = totalLimitActual - totalSpentActual;
        

        // Assert
        assertEquals(totalLimitActual, totalLimitActual);
        assertEquals(totalSpentExpected, totalSpentActual);
        assertEquals(remainderExpected, remainderActual);

    }



    
}
