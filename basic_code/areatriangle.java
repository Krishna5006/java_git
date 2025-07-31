import java.util.Scanner;

public class areatriangle {
    public static void main(String[] args) {
        float a,b,c,semi_perimeter,area;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1st side of triangle");
        a=sc.nextFloat();
        System.out.println("Enter 2nd side of triangle");
        b=sc.nextFloat();
        System.out.println("Enter 3rd side of triangle");
        c=sc.nextFloat();
        semi_perimeter = (a+b+c)/2f;
        System.out.println("Semi-perimeter is:"+semi_perimeter);
        sc.close();
        area=(float)Math.sqrt(semi_perimeter*(semi_perimeter-a)*(semi_perimeter-b)*(semi_perimeter-c));
        System.out.println("Area of triangle is :"+area);
        
    }
}
