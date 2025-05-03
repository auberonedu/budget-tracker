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
        String expected = "Category: Food" + " limit: 400.0" + " spent: 500.0";
        assertEquals(expected, actual);
    }
    // Wave 4 tests
    @Test
    void spentRatioEqualsOne(){
        //Arrange
        BudgetCategory budgetVideoGames = new BudgetCategory("Videogames", 80, 200);
        BudgetCategory budgetFood = new BudgetCategory("Food", 400, 500);

        //Act
        int actual = budgetVideoGames.compareTo(budgetFood);

        //Assert
        assertEquals(-1, actual);
    }

    @Test
    void spentRatioEqualsNegativeOne(){
       //Arrange
        BudgetCategory budgetVideoGames = new BudgetCategory("Videogames", 80, 200);
        BudgetCategory budgetFood = new BudgetCategory("Food", 400, 700);

        //Act
        int actual = budgetVideoGames.compareTo(budgetFood);
        
        //Assert
        assertEquals(1, actual);
    }

    @Test
    void spentRatioEqualsZero(){
        //Arrange
        BudgetCategory budgetVideoGames = new BudgetCategory("Videogames", 400, 700);
        BudgetCategory budgetFood = new BudgetCategory("Food", 400, 700);

        //Act
        int actual = budgetVideoGames.compareTo(budgetFood);
        
        //Assert
        assertEquals(0, actual);
    }
}
