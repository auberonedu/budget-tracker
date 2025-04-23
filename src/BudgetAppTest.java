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
    
}
