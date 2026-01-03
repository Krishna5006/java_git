import java.util.*;

class syntax{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int [][] arr=new int[3][3];

        System.out.print("Length of array:"); 
        System.out.println(arr.length); //---->3  arr.lenght presents no of rows

        //input of array
        for (int row=0;row<arr.length;row++)
        {
            for (int col=0;col<arr[row].length;col++)
            {
                arr[row][col]=sc.nextInt();
            }
        }

        //output of array
        for (int row=0;row<arr.length;row++)
        {
            for (int col=0;col<arr[row].length;col++)
            {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println("");
        }

        //output method 2 
        for (int row=0;row<arr.length;row++)
        {
            System.out.println(Arrays.toString(arr[row]));
        }

        System.out.println("");

        //enhanced for loop
        for (int[] a : arr)
        {
            System.out.println(Arrays.toString(a));
        }
        sc.close();
    }
}