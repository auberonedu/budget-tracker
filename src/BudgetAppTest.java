import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

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
        BudgetCategory entertainment = new BudgetCategory("entertainment", 125, 150); // Over 25
        BudgetCategory rent = new BudgetCategory("rent", 1500, 1800); // Over 300

        // Act
        int actual = entertainment.compareTo(rent);

        // Assert
        assertEquals(1, actual);
    }

    @Test
    void testingForCompareToBudget2(){
        // Arrange
        BudgetCategory groceries = new BudgetCategory("groceries", 200, 180); // Under 20
        BudgetCategory entertainment = new BudgetCategory("entertainment", 200, 220); // Over 20

        // Act
        int actual = entertainment.compareTo(groceries);

        // Assert
        assertEquals(-1, actual);
    }

    @Test
    void testingForCompareToBudget3(){
        // Arrange
        BudgetCategory diningOut = new BudgetCategory("dining out", 250, 250); // Even
        BudgetCategory utilities = new BudgetCategory("utilities", 400, 400); // Even

        // Act
        int actual = utilities.compareTo(diningOut);

        // Assert
        assertEquals(0, actual);
    }

    // Wave 5
    @Test
    void testingTotalOfBudgetDifference(){

        // Arrange
        // Create categories
        BudgetCategory groceries = new BudgetCategory("Groceries", 400, 450); // Over 50
        BudgetCategory rent = new BudgetCategory("Rent", 1000, 1000); // Even
        BudgetCategory diningOut = new BudgetCategory("Dining Out", 200, 185); // Under 15
        BudgetCategory transportation = new BudgetCategory("Transportation", 100, 90); // Under 10
        BudgetCategory entertainment = new BudgetCategory("Entertainment", 100, 200); // Over 100
        BudgetCategory utilities = new BudgetCategory("Utilities", 150, 180); // Over 30

        // Create a list
        List<BudgetCategory> myList = new ArrayList<>();
        myList.add(groceries);
        myList.add(rent);
        myList.add(diningOut);
        myList.add(transportation);
        myList.add(entertainment);
        myList.add(utilities);

        // Act
        double actualDifferences = BudgetApp.budgetDifference(myList);
        double expectedDifferences = 50 + 0 - 15 - 10 + 100 + 30;

        // Assert
        assertEquals(expectedDifferences, actualDifferences, 155);




    }


    @Test
    void testingTotalOfBudgetDifference2(){

        // Arrange
        // Create categories
        BudgetCategory groceries = new BudgetCategory("Groceries", 400, 500); // Over 100
        BudgetCategory rent = new BudgetCategory("Rent", 1800, 2000); // Over 200
        BudgetCategory diningOut = new BudgetCategory("Dining Out", 250, 200); // Under 50
        BudgetCategory transportation = new BudgetCategory("Transportation", 150, 120); // Under 30
        BudgetCategory entertainment = new BudgetCategory("Entertainment", 150, 200); // Over 50
        BudgetCategory utilities = new BudgetCategory("Utilities", 150, 120); // Under 30

        // Create a list
        List<BudgetCategory> myList = new ArrayList<>();
        myList.add(groceries);
        myList.add(rent);
        myList.add(diningOut);
        myList.add(transportation);
        myList.add(entertainment);
        myList.add(utilities);

        // Act
        double actualDifferences = BudgetApp.budgetDifference(myList);
        double expectedDifferences =  100 + 200 - 50 - 30 + 50 - 30;

        // Assert
        assertEquals(expectedDifferences, actualDifferences, 300);




    }
    
}
