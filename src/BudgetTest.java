import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BudgetTest {
    @Test
    void totalLimitAcutallyEqualstheSum(){
        //Arrange
        Budget firstBudget = new Budget();
        firstBudget.add(new BudgetCategory("food", 200.0, 150.0));
        firstBudget.add(new BudgetCategory("rent", 1000.0, 1000.0));

        //Act
        double actual = firstBudget.totalLimit();

        //Assert
        assertEquals(1200.0, actual);
    }
   
    @Test
    void totalSpentActuallyEqualstheSum(){
        //Arrange
        Budget firstBudget = new Budget();
        firstBudget.add(new BudgetCategory("food", 200.0, 5000.0));
        firstBudget.add(new BudgetCategory("rent", 1000.0, 1000.0));

        //Act
        double actual = firstBudget.totalSpent();

        //Assert
        assertEquals(6000.0, actual);
    }
    @Test
    void remainderActuallyEqualsTheDifferenceBetweenTheTwoNumbers(){
        //Arrange
        Budget firstBudget = new Budget();
        firstBudget.add(new BudgetCategory("food", 200.0, 150.0));
        firstBudget.add(new BudgetCategory("rent", 1000.0, 1000.0));
        firstBudget.add(new BudgetCategory("sushi", 100, 1000.0));
        
        //Act
        double actual = firstBudget.remainder();

        //Assert
        assertEquals(-850, actual);

    }

    
}
