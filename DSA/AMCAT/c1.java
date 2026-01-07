package DSA.AMCAT;
import java.util.*;
public class c1
{
   public static void main(String[] args) 
   {
    Scanner sc=new Scanner(System.in);
    System.err.print("Enter number:");
    int num=sc.nextInt();
    EvenOddCheck(num);
    sc.close();
   } 
   public static void EvenOddCheck(int num)
   {
        if(num%2==0)
        {
            System.err.println("Number is even:"+ num);
        }
        else
        {
            System.err.println("Number is odd:"+ num);
        }
    }
}
