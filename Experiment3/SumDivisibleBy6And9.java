package Experiment3;

public class SumDivisibleBy6And9 {
    public static void main(String[] args) {
        int sum = 0;

        // The smallest number divisible by both 6 and 9 is 18 (LCM of 6 and 9)
        for (int i = 18; i <= 950; i += 18) { // Incrementing by 18
            sum += i; // Adding the number to the sum
        }

        // Printing the final sum
        System.out.println("Sum: " + sum);
}
}
