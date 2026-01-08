import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
            {21,4,12,3},
            {2,3},
            {3,1},
            {0,-1}
        };
        int target=-1;
        int[] ans=SearchIn2DArrayFunction(arr, target);
        System.out.println(Arrays.toString(ans));

        //System.err.println(SearchIn2DArrayFunction(arr,target));
    }
    static int[] SearchIn2DArrayFunction(int[][] arr,int target)
    {
        for(int row=0;row<arr.length;row++)
        {
            for (int column=0;column<arr[row].length;column++)
            {
                if (arr[row][column]==target)
                {
                    return new int[]{row,column};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
