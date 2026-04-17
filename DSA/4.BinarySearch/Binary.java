public class Binary {
    public static void main(String[] args) {
        int[] arr={21,32,13,42,43,56,76,45,34,21,46,64,215,2652};
    }
    static int BS(int[] arr,int target,int start,int end)
    {
        while (start<=end)
        {
            int mid=start+(end-start)/2;

            if(target<=arr[mid]){
                end=mid-1;
            }
            else if (target>=arr[mid]) {
                start=mid+1;
            }
            else{
                
            }
        }
        return ans;
    }
}
