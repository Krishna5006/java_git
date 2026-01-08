import java.util.*;

public class LinearSearch3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=9;
        int[] arr={11,2,313,53,47,124,61,3,51,16,2,9};
        int ans=LinearSearchFunction(arr, target);
        System.err.println(ans);
        sc.close();
    }

    //search in the array:return index if item found else return -1 
    static int LinearSearchFunction(int[] arr,int target)
    {
        if (arr.length==0)
            return -1;

        for (int i=0 ;i<arr.length;i++)
        {
            int element=arr[i];
            if (element==target)
            {
                return element;
            }
        }
        return -1;
    }
}
