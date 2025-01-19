import java.util.Scanner;

public class cuboid {
    public static void main(String[] args) {
        float length,breadth,height,volume,total_surfacearea;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of Cuboid:");
        length=sc.nextFloat();
        System.out.println("Enter Breadth of Cuboid:");
        breadth=sc.nextFloat();
        System.out.println("Enter Height of Cuboid:");
        height=sc.nextFloat();
        volume=length*breadth*height;
        total_surfacearea=2*(length*breadth+length*height+breadth*height);
        System.out.println("Volume of Cuboid is:"+volume);
        System.out.println("Surface area of Cuboid is:"+total_surfacearea);
        sc.close();

    }
}
