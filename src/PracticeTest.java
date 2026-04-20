import static org.junit.jupiter.api.Assertions.*;  // ✅ JUnit 5
import org.junit.jupiter.api.Test;                 // ✅ JUnit 5
public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        System.out.println(actual);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);

    }
    

    // TODO: Make tests for each problem you solve
    
}


