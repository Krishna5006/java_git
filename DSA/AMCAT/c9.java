public class c9 {
    public static void main(String[] args) {
        int num1=5;
        int num2=10;
        swapNumber1(num1, num2);
    }
    // static void swapNumber(int a,int b){
    //     int temp=a;
    //     a=b;
    //     b=temp;
    //     System.out.println("Val of num1="+a);
    //     System.out.println("Val of num2="+b);
    // }
    static void swapNumber1(int a,int b){
        b=b-a;
        a=b+a;
        System.out.println("Val of num1="+a);
        System.out.println("Val of num2="+b);
    }
}
