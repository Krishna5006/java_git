public class c6 {
    public static void main(String[] args) {
        int num=5;
        System.out.println(factorial(num));
    }
    static int factorial(int num){
        int factorialresult=1;
        for(int i=2;i<=num;i++){
            factorialresult=factorialresult*i;
        }
        return factorialresult;
    }
}
