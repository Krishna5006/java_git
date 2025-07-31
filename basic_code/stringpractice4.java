public class stringpractice4 {
    public static void main(String[] args) {
        String str1 ="Java";
        String str4 ="Java";
        String str2 ="java";
        String str3=new String("java");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        //reference check
        System.out.println(str1==str4);
        System.out.println(str1==str3);
    }
}
