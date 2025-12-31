public class stringpractice2 {

    public static void main(String[] args) {
        String str1=new String("Himalayas");
        String str_trim=new String("     Himalayas     ");
        int l=str1.length();
        System.out.println(l);
        String strU=str1.toUpperCase();
        System.out.println(strU);
        String strL=str1.toLowerCase();
        System.out.println(strL);
        String strT=str_trim.trim();
        System.out.println(strT);
        // here white spa
        String strsubs=str1.substring(2,6);
        System.out.println(strsubs);
        String str_replace=str1.replace('a','E');
        System.out.println(str_replace);
    }
} 