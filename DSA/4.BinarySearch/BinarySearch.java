public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,4,6,9,11,12,14,20,36,48};
        int target=36;
        int ans=BinarySearchFunction(arr,target);
        System.out.println(ans);
    }

    static int BinarySearchFunction(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {
            //Find the Middle Element
            //int mid=(start+end)/2; //midht be possible that (start+end) is greater than range of int
            //so we will use
            int mid=start+(end-start)/2;

            //checking condition greater or smaller
            if (target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                //here target == middle
                return mid;
            }
        }
        return -1;
    }
}
