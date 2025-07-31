//Complete the function printNumber which takes an integer input from the user and prints it on the screen.

import java.util.Scanner;
class Solution {
    public void printNumber() 
    {
        System.out.println("Enter Number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Entered Number is : "+number);
        sc.close();
    }
}