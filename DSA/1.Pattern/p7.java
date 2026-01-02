/*

*
**
***
****
*****
****
***
**
*

*/
import java.util.Scanner;
class p7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size:");
        int n=sc.nextInt();
        for (int i=1;i<2*n;i++)
        {
            int stars;

            if (i<=n)
            {
                stars=i;
            }
            else
            {
                stars=2*n-i;
            }
            for (int j=1;j<=stars;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}