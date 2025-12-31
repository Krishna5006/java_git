package Experiment3;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 2, 4}; // Given array

        int n = arr.length + 1; // Since one number is missing, actual N = length + 1
        int expectedSum = n * (n + 1) / 2; // Sum of first N natural numbers
        int actualSum = 0;

        // Calculate the sum of elements in the array
        for (int num : arr) {
            actualSum += num;
        }

        // The missing number is the difference between expected and actual sum
        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number: " + missingNumber);
    }
}
