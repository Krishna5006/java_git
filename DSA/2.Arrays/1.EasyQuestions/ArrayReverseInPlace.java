import java.util.*;
public class ArrayReverseInPlace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter Array Size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        InitializingArray(arr,sc);
        PrintingArray(arr);
        ArrayReverseInPlaceFunction(arr);
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

    static void PrintingArray(int[] arr)
    {
        System.out.println("Output Array:");
        for (int a : arr)
        {
            System.err.print(a + " ");
        }
        System.err.println("");
    }

    static void ArrayReverseInPlaceFunction(int[] arr)
    {
        int j=arr.length-1;
        int temp=0;
        // for (int i=0;i<arr.length-1;i++) 
        for (int i=0;i<arr.length/2;i++) 
        {
            if (i<=j)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        System.err.print("Reversed ");
        PrintingArray(arr);
    }
}
