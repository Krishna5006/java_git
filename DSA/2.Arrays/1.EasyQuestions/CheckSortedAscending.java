import java.util.Scanner;

public class CheckSortedAscending {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter Array Size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        InitializingArray(arr,sc);
        //PrintingArray(arr,sc);
        CheckSortedAscendingFunction(arr);
        sc.close();
    }

    static void InitializingArray(int[] arr,Scanner sc)
    {
        System.out.println("Initialize Array:");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
    }

    static void PrintingArray(int[] arr,Scanner sc)
    {
        System.out.println("Output Array:");
        for (int a : arr)
        {
            System.err.print(a + " ");
        }
    }
    static void CheckSortedAscendingFunction(int[]arr)
    {
        // int j=arr[1];
        for (int i=0;i<arr.length-1;i++)
        {
            if (arr[i]<=arr[i+1])
            {
                
            }
            else{
                System.err.println("Not in Ascending order");
                return;
            }
        }
        System.err.println("In Ascending order");
    }
}
