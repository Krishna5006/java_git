public class RichestCustomerWealth 
{
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(Wealth(accounts));
        
    }
    static int Wealth(int[][] accounts)
    {
        int maxVal=Integer.MIN_VALUE;
        int sum=0;
        for (int[] person : accounts)
        {
            for (int account : person) 
            {
                sum+=account;
            }
        }
        if (sum>maxVal)
        {
            maxVal=sum;
        }
        return maxVal;
    }
}

