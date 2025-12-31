package Experiment3;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99, 99, 5}; // Given array

        int largest = Integer.MIN_VALUE; // Store the largest value
        int secondLargest = Integer.MIN_VALUE; // Store second largest value

        // Loop through array elements
        for (int num : arr) {
            if (num > largest) { 
                secondLargest = largest; // Update second largest
                largest = num; // Update largest
            } else if (num > secondLargest && num != largest) { 
                secondLargest = num; // Update second largest if it's smaller than largest
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
    }
}
