public class EvenDigit 
{
    public static void main(String[] args) 
    {
        int[] arr={31,422,131,322,1313};
        System.out.println(findNumber(arr));
    }

    static int findNumber(int[] arr)
    {
        int count=0;
        for (int num: arr)
        {
            if (even(num))
            {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num)
    {
        int numberOfDigit=EvenDigitFunction(num);
        // if (numberOfDigit%2==0)
        // {
        //     return true;
        // }
        // return false;

        return numberOfDigit%2==0;
    }

    static int EvenDigitFunction(int num)
    {
        int count=0;
        while (num>0) 
            {
            count++;
            num=num/10;
        }
        return count;
    }
}
