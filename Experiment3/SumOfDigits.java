package Experiment3;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        int sum = 0;

        // Extracting digits using a while loop
        while (num != 0) {
            sum += num % 10; // Extracting the last digit and adding to sum
            num /= 10;       // Removing the last digit
        }

        // Printing the sum of digits
        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
}
