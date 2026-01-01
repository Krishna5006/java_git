//square fill pattern
import java.util.Scanner;

class p1
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of square:");
        n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}