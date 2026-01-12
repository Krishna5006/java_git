public class c7 {
    public static void main(String[] args) {
        int num=1415;
        // System.out.println(strongNumber(num));
        if (num==strongNumber(num)){
            System.out.println("Strong no");
        }
        else{
            System.out.println("Not a strong no");
        }
    }
    static int strongNumber(int num){
        int sum=0;
        int temp=num;

        while(temp>0){
            int digit=temp%10;
            int fact=1;
            for(int i=1;i<=digit;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            temp=temp/10;
        }
        return sum;
    }
}
