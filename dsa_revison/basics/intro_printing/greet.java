package dsa_revison.basics.intro_printing;

import java.util.Scanner;
public class greet {
    public static void main(String[] args) 
    {
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Hello " +name +" How are you?");
        sc.close();
    }

}
