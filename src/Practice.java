public class Practice {

    public static void main(String[] args) {
        int[] numbers = {8, -2, 9, -5};
        maxDiff(numbers);
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


    // TODO: Implement the other methods from the README AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.
}
