import java.util.*;
public class MethodSyntax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter Array Size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        InitializingArray(arr,sc);
        PrintingArray(arr,sc);
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
}

    

