import java.util.Scanner;

class p10
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();
        int space;
        int num;

        for (int i=1;i<2*n;i++)
        {
            if (i<=n)
            {
                space=n-i;
                num=i;
            }
            else
            {
                space=i-n;
                num=2*n-i;
            }
            for (int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }

            for(int j=num;j>=1;j--)
            {
                System.out.print(j);
            }
            for(int j=2;j<=num;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
        sc.close();
    }
}