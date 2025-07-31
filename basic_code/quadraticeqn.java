import java.util.Scanner;

public class quadraticeqn {
    public static void main(String[] args) {
        int a,b,c;
        double r1,r2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Coefficient of x^2");
        a=sc.nextInt();
        System.out.println("Enter Coefficient of x");
        b=sc.nextInt();
        System.out.println("Enter constant term");
        c=sc.nextInt();
        r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
        r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("Root of the Eqn are as follow:");
        System.out.println("Root 1:"+r1);
        System.out.println("Root 2:"+r2);

        System.out.println("Root of the Eqn are as follow:" +r1+"  "+r2);
        sc.close();

    }
}
