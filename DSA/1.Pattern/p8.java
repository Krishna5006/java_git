//This is the basic layout every code will have 
import java.util.Scanner;
class p8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size:");
        int n=sc.nextInt();
        for (int i=0;i<n*2;i++)
        {
            int totalColumnInRow=i>n?2*n-i:i;

            int noOfSpace=n-totalColumnInRow;

            for (int j=0;j<noOfSpace;j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<totalColumnInRow;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        sc.close();
    }
}