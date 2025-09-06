package dsa_revison.basics.User_input_basic;

//Take two numbers as input and print their sum, difference, product, and quotient.
import java.util.Scanner;
public class calc 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num_1,num_2;
        System.out.println("Enter two number");
        System.out.print("Enter first number: ");
        num_1=sc.nextInt();
        System.out.print("Enter Second number: ");
        num_2=sc.nextInt();
        System.out.print("Sum of the given two number are: ");
        int sum=num_1+num_2;
        System.out.println(sum);
        System.out.print("Differnce of the given two number are: ");
        int difference=num_1-num_2;
        System.out.println(difference);
        System.out.print("Product of the given two number are: ");
        int product=num_1*num_2;
        System.out.println(product);
        System.out.print("Quotient of the given two number are: ");
        int quotient=num_1/num_2;
        System.out.println(quotient);


        //why to not use the above approach 
        // Code Repetition
        System.out.println("Sum: " + (num_1 + num_2));
        System.out.println("Difference: " + (num_1 - num_2));
        System.out.println("Product: " + (num_1 * num_2));
        System.out.println("Quotient: " + (num_1 / num_2));


        //Divison by zero Handling 
        /*
        if(num_2 != 0) {
        System.out.println("Quotient: " + (num_1 / num_2));
        } else {
            System.out.println("Cannot divide by zero!");
        }
        */

        /*
        double quotient = (double) num_1 / num_2;
        System.out.println("Quotient: " + quotient);

        Use of double for Division:
        Currently, you’re using int, so 7/2 will give 3, not 3.5. If you want proper division results, use double:
        */
        sc.close();


    }
}
