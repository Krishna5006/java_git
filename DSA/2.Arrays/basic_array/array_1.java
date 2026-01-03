
class array_1
{
    public static void main(String args[])
    {
        //Q.store a roll no
        // int a=10;

        //Q.store a person name
        // String name="Krishna Bisht";

        //Q. Store 5 roll number
        // int rno1=1;
        // int rno2=2;
        // int rno3=3;
        // int rno4=4;
        // int rno5=5;

        //Syntax for 1-D Array
        //int A[]=new int[5] ; 
        //int[] A=new int[5] ; // more preferred

        //direct syntax
        int[] A={1,2,3,4,5,6,7,8,9,10};

        //display element
        for (int i=0 ;i<A.length;i++)
        {
            System.out.print(i + " "); //single line print
            //System.out.println(i); // multiple line printing 
        }
        System.out.println("");
        System.out.println("Reverse Display:");

        for (int i=A.length-1 ;i>=0;i--)
        {
            //System.out.print(i + " "); 
            System.out.println(i); // multiple line printing 
        }


    }
}