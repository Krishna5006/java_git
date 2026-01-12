import java.lang.Math;
public class c4 {
    public static void main(String[] args) {
        int num=123;
        // int count=countDigit(num);
        int ans=armstrongNumber(num);
        if (num==ans){
            System.out.println("Armstrong no");
        }
        else{
            System.out.println("Not a armstrong no");
        }
    }
    // static int countDigit(int num){
    //     int count=0;
    //     while(num>0)
    //     {
    //         count++;
    //         num=num/10;
    //     }
    //     return count;
    // }
    // static int totalSum(int num){
    //     int sum=0;
    //     while(num>0){
    //         int digit=num%10;
    //         num=num/10;
    //         sum=sum+digit*countDigit(num);
    //     }
    //     return sum;
    // }
    static int armstrongNumber(int num){
        int count=0;
        int sum=0;
        int num1=num;
        while(num1>0)
        {
            count++;
            num1=num1/10;
        }
        while(num>0)
            {
            int digit=num%10;
            num=num/10;
            sum=sum+(int)Math.pow(digit, count);
        }
        return sum;
    }
}
