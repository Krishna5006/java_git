public class OrderAgnosticBinarySearch 
{
    public static void main(String[] args) {
        //int[] arr={2,4,6,9,11,12,14,20,36,48};
        int[] arr={200,124,106,90,87,72,64,50,36,18,1};
        int target=124;
        int ans=OrderAgnosticBinarySearchFunction(arr,target);
        System.out.println(ans);
    }
    static int OrderAgnosticBinarySearchFunction(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        if(arr[start]< arr[end])
            {
            while(start<=end){
                int mid=start+(end-start)/2;

                if(target==arr[mid]){
                    return mid;
                }

                else if(target<mid){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        else{
            while(start<=end){
                int mid=start+(end-start)/2;

                if(target==arr[mid]){
                    return mid;
                }

                else if(target<arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}


// static int orderAgnosticBS(int[] arr, int target) {
//         int start = 0;
//         int end = arr.length - 1;

//         // find whether the array is sorted in ascending or descending
//         boolean isAsc = arr[start] < arr[end];

//         while(start <= end) {
//             // find the middle element
// //            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
//             int mid = start + (end - start) / 2;

//             if (arr[mid] == target) {
//                 return mid;
//             }

//             if (isAsc) {
//                 if (target < arr[mid]) {
//                     end = mid - 1;
//                 } else {
//                     start = mid + 1;
//                 }
//             } else {
//                 if (target > arr[mid]) {
//                     end = mid - 1;
//                 } else {
//                     start = mid + 1;
//                 }
//             }
//         }
//         return -1;
//     }
// }