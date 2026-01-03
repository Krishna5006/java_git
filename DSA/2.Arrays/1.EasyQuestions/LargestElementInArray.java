import java.util.*;

public class LargestElementInArray 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("");
        System.out.print("Enter elements in array:");
        for (int i =0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("");
        System.out.print("Array output:");
        for(int a: arr)
        {
            System.out.print(a + " ");
        }
        System.out.println("");

        
        int largenum=arr[0];
        for (int i=1;i<=arr.length-1;i++)
        {
            if (largenum<arr[i])
            {
                largenum=arr[i];
            }
        }
        System.out.println("Largest Element in array:" + largenum);
        sc.close();

    }
    
}