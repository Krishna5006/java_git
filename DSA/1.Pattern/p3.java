//Right half pyramid opposite
import java.util.Scanner;

class p3
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of pyramid:");
        n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=n;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}