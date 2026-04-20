import static org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.Test;  
import java.util.*;

public class PracticeTest {

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

    @Test
    void testMaxDiffPositive() {
        // Arrange
        int[] numbers = {8, 2, 9, 5};

        // Act
        int actual = Practice.maxDiff(numbers);

        System.out.println(actual);

        // Assert
        // Largest: 9, Smallest: 2, Difference: 9 - 2 = 7
        assertEquals(7, actual);

    }

    @Test
    void testMaxDiffNegative() {
        // Arrange
        int[] numbers = {-8, -2, -9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        System.out.println(actual);

        // Assert
        // Largest: 2, Smallest: -9, Difference: -2 - -9 = 7
        assertEquals(7, actual);

    }

    @Test
    void testMaxDiffOneValue() {
        // Arrange
        int[] numbers = {5};

        // Act
        int actual = Practice.maxDiff(numbers);

        System.out.println(actual);

        // Assert
        // Largest: 5, Smallest: 5, Difference: 5 - 5 = 0
        assertEquals(0, actual);

    }
    
    // Testing longestWord

    @Test
    void testLongestWordOneElementWrongChar() {
        // Arrange
        ArrayList<String> words = new ArrayList<>();

        words.add("oneword");

        // Act
        String actual = Practice.longestWord(words, "z");

        System.out.println(actual);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals("", actual);

    }

    @Test
    void testLongestWordOneWordRightChar() {
        // Arrange
        ArrayList<String> words = new ArrayList<>();

        words.add("oneword");

        // Act
        String actual = Practice.longestWord(words, "o");

        System.out.println(actual);

        // Assert
        assertEquals("oneword", actual);

    }

    @Test
    void testLongestWordManyWords() {
        // Arrange
        ArrayList<String> words = new ArrayList<>
            (List.of("oneword", "twoword", "moreword", "asfhj", "orange", "old")
        );
        // Act
        String actual = Practice.longestWord(words, "o");

        System.out.println(actual);

        // Assert
        assertEquals("oneword", actual);

    }

    @Test
     void testLongestWordSpecialChar() {
        // Arrange
        ArrayList<String> words = new ArrayList<>
            (List.of("oneword", "@woword", "@word", "asfhj", "orange", "old")
        );
        // Act
        String actual = Practice.longestWord(words, "@");

        System.out.println(actual);

        // Assert
        assertEquals("@woword", actual);

    }

    // Testing countBetween

    @Test
    void testCountBetweenLongList() {
        // Arrange
        HashSet<String> words = new HashSet<>
            (Set.of("oneword", "woword", "word", "asfhj", "orange", "old")
        );

        // Act
        int actual = Practice.countBetween(words, 5, 8);

        System.out.println(actual);

        // Assert
        assertEquals(3, actual);

    }

    @Test
    void testCountBetweenShortList() {
        // Arrange
        HashSet<String> words = new HashSet<>
            (Set.of("oneword")
        );
        // Act
        int actual = Practice.countBetween(words, 5, 8);

        System.out.println(actual);

        // Assert
        assertEquals(1, actual);

    }

    @Test
    void testCountBetweenNoList() {
        // Arrange
        HashSet<String> words = new HashSet<>();

        // Act
        int actual = Practice.countBetween(words, 5, 8);

        System.out.println(actual);

        // Assert
        assertEquals(0, actual);

    }

    @Test
    void testCountBetweenNoMatches() {
        // Arrange
        HashSet<String> words = new HashSet<>
            (Set.of("oneword", "woword", "word", "asfhj", "orange", "old")
        );

        // Act
        int actual = Practice.countBetween(words, 0, 2);

        System.out.println(actual);

        // Assert
        assertEquals(0, actual);

    }

    // Testing oddEvenDifference

    @Test
    void testOddEvenDifferenceOdd() {
        // Arrange
        HashMap<Integer, Integer> nums = new HashMap<>
            (Map.of(1, -5, 2, 7, 3, -17)
        );

        // Act
        int actual = Practice.oddEvenDifference(nums);

        System.out.println(actual);

        // Assert
        assertEquals(3, actual);

    }

     @Test
    void testOddEvenDifferenceEven() {
        // Arrange
        HashMap<Integer, Integer> nums = new HashMap<>
            (Map.of(1, 6, 2, 2, 3, -4)
        );

        // Act
        int actual = Practice.oddEvenDifference(nums);

        System.out.println(actual);

        // Assert
        assertEquals(-3, actual);

    }

    @Test
    void testOddEvenDifferenceNoValues() {
        // Arrange
        HashMap<Integer, Integer> nums = new HashMap<>();

        // Act
        int actual = Practice.oddEvenDifference(nums);

        System.out.println(actual);

        // Assert
        assertEquals(0, actual);

    }

    @Test
    void testOddEvenDifferenceAllValues() {
        // Arrange
        HashMap<Integer, Integer> nums = new HashMap<>(
            Map.of(1, 3, 2, 4, 3, 7)
        );

        // Act
        int actual = Practice.oddEvenDifference(nums);

        System.out.println(actual);

        // Assert
        assertEquals(1, actual);

    }

    // Testing secondLargest

    @Test
    void testSecondLargestManyValues() {
        // Arrange
        HashMap<Integer, Integer> nums = new HashMap<>(
            Map.of(13, 1, 0, 2, -16, 3, 8, 4)
        );

        // Act
        int actual = Practice.secondLargest(nums);

        System.out.println(actual);

        // Assert
        assertEquals(8, actual);

    }

    @Test
    void testSecondLargestOneValue() {
        // Arrange
        HashMap<Integer, Integer> nums = new HashMap<>(
            Map.of(13, 1)
        );

        // Act
        int actual = Practice.secondLargest(nums);

        System.out.println(actual);

        // Assert
        assertEquals(13, actual);

    }
    
    
}


