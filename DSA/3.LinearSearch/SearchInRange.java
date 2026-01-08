public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={21,13,14,15,16,17,18,19,21,24,55,15,61};
        int start=3,end=9;
        int target=116;
        int ans=SearchInRangeFunction(arr,start,end,target);
        System.err.println(ans);
    }

    static int SearchInRangeFunction(int[] arr,int start,int end,int target)
    {
        for (int i=start;i<=end;i++)
        {
            if (arr[i]==target)
            {
                return target;
            }
        }
        return Integer.MAX_VALUE;
    }
}
