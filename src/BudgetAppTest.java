import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BudgetAppTest {

    // Wave 2
    @Test
    void testingToStringForRent(){
        // Arrange
       BudgetCategory rent = new BudgetCategory("rent", 500.0, 500.0);
       String expected = "The budget limit for rent was: 500.0 but the actual spend was 500.0";

        // Act
        String actual = rent.toString();
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void testingToStringForEntertainment(){
        // Arrange
        BudgetCategory entertainment = new BudgetCategory("entertainment", 125, 150);
        String expected = "The budget limit for entertainment was: 125.0 but the actual spend was 150.0";

        // Act
        String actual = entertainment.toString();

        // Assert
        assertEquals(expected, actual);
    }


    // Wave 4
    @Test
    void testingForCompareToBudget1(){
        // Arrange
        BudgetCategory entertainment = new BudgetCategory("entertainment", 125, 150);
        BudgetCategory rent = new BudgetCategory("rent", 1500, 1800);

        // Act
        int actual = entertainment.compareTo(rent);

        // Assert
        assertEquals(1, actual);
    }

    @Test
    void testingForCompareToBudget2(){
        // Arrange
        BudgetCategory groceries = new BudgetCategory("groceries", 200, 180);
        BudgetCategory entertainment = new BudgetCategory("entertainment", 200, 220);

        // Act
        int actual = entertainment.compareTo(groceries);

        // Assert
        assertEquals(-1, actual);
    }

    @Test
    void testingForCompareToBudget3(){
        // Arrange
        BudgetCategory diningOut = new BudgetCategory("dining out", 250, 250);
        BudgetCategory utilities = new BudgetCategory("utilities", 400, 400);

        // Act
        int actual = utilities.compareTo(diningOut);

        // Assert
        assertEquals(0, actual);
    }
    
}
