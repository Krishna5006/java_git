import java.util.*;

public class LinearSearch2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=91;
        int[] arr={11,2,313,53,47,124,61,3,51,16,2,9};
        boolean ans=LinearSearchFunction(arr, target);
        System.err.println(ans);
        sc.close();
    }

    //search in the array:return true if item found else return false 
    static boolean LinearSearchFunction(int[] arr,int target)
    {
        if (arr.length==0)
            return false;

        for (int i=0 ;i<arr.length;i++)
        {
            int element=arr[i];
            if (element==target)
            {
                return true;
            }
        }
        return false;
    }
}
