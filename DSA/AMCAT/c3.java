public class c3 
{
    public static void main(String[] args) {
        int num=1561;
        int ans=reversedNumber(num);
        if(num==ans)
        {
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
    }
    static int reversedNumber(int num)
    {
        int reverseNo=0;
        while (num>0)
        {
            int digit=num%10;
            num=num/10;
            reverseNo=reverseNo*10+digit;
        }
        return reverseNo;
    }
}
