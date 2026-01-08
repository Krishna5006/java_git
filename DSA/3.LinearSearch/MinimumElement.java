public class MinimumElement {
    public static void main(String[] args) {
        int[] arr={19,21,31,42,13,65,31,4,3};
        System.err.println(MinimumElementFunction(arr));
    }

    static int MinimumElementFunction(int[] arr)
    {
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
}
