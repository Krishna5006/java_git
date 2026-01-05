import java.util.Scanner;

public class EvenOddCount {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter Array Size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        InitializingArray(arr,sc);
        //PrintingArray(arr,sc);
        EvenOddCountFunction(arr);
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
    static void EvenOddCountFunction(int[] arr)
    {
        int evenCount=0,oddCount=0;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]%2==0)
            {
                evenCount=evenCount+1;
            }
            else{
                oddCount=oddCount+1;
            }
        }
        System.err.println("Count of Even element=" +evenCount);
        System.err.println("Count of Odd element=" + oddCount);
    }
}
