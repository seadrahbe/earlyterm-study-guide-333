import java.util.*;

public class Practice {

    public static void main(String[] args) {

        // Function debugging 

        HashSet<String> words = new HashSet<>
            (Set.of("oneword", "woword", "word", "asfhj", "orange", "old")
        );

        countBetween(words, 5, 8);
    }

    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        int big = -1000000000;
        int small = 1000000000;
        
        for (int el : nums) {
            if (el > big) {
                big = el;
            }

            if (el < small) {
                small = el;
            }
        }
        return big - small;
    }



    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.

    /**
     * Returns the longest word in an ArrayList starting with the submitted character (or string)
     * 
     * @param list a non-empty, non-null ArrayList of Strings
     * @param ch a starting String or character
     * @return the longest word starting with that String
     */
    public static String longestWord(ArrayList<String> list, String ch) {

        String longestWord = "";

        for (String el : list) {
            if(el.startsWith(ch)) {
                if(el.length() > longestWord.length()) {
                    longestWord = el;
                }
            }

        }

        return longestWord;
    }

    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param set a set of Strings
     * @param n the int length the String must be greater than
     * @param m the int length the String must be less than
     * @return the number of Strings between the two lengths
     */
    public static int countBetween(HashSet<String> set, int n, int m) {
        int count = 0;

        for (String el : set) {
            if (el.length() > n && el.length() < m) {
                count++;
            }
        }

        System.out.println(count);

        return count;
    }

    
    /**
     * Returns the difference between the number of odd and even integers in the
     * values of a hashmap
     * 
     * @param mappy the hashmap to be evaluated
     * @return the difference between the number of odd and even integers
     */
    public static int oddEvenDifference(HashMap<Integer, Integer> mappy) {
        int oddCount = 0;
        int evenCount = 0;

        for (int el : mappy.values()) {
            if (el % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        return oddCount - evenCount;
    }

    /**
     * Returns the second-largest number in the keys of the submitted hashmap
     * 
     * @param mappy the hashmap to be evaluated
     * @return the second-largest number
     */
    public static int secondLargest(HashMap<Integer, Integer> mappy) {
        int secondLargest = -1000000000;
        int largest = -1000000000;

        if (mappy.size() > 1) {
            for (int el : mappy.keySet()) {
                if (el > largest) {
                    largest = el;
                }
            }

            for (int el : mappy.keySet()) {
                if (el > secondLargest && el < largest) {
                    secondLargest = el;
                }
            }
        } else {
            for (int el : mappy.keySet()) {
                secondLargest = el;
            }
        }

        return secondLargest;
    }


}
