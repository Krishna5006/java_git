import java.util.Scanner;

class test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        
        for (int i=1;i<2*n;i++)
        {
            int spaces, stars;

            
            if (i <= n)
            {
                spaces = n - i;
                stars = i;
            }
            
            else
            {
                spaces = i - n;
                stars = 2*n - i;
            }

            
            for (int j = 1; j <= spaces; j++)
            {
                System.out.print(" ");
            }

            
            for (int j = 1; j <= stars; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}
