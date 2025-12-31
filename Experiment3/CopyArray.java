package Experiment3;

public class CopyArray {
    public static void main(String[] args) {
        // Original array
        int[] sourceArray = {10, 20, 30, 40, 50};

        // Create a new array with the same length as the source array
        int[] destinationArray = new int[sourceArray.length];

        // Copy elements using a loop
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i]; // Copy each element
        }

        // Print the copied array
        System.out.print("Copied Array: ");
        for (int num : destinationArray) {
            System.out.print(num + " ");
        }
    }
}
