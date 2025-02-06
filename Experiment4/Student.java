class Student {
    String name;
    int age;

    public Student() 
    {
        this.name = "Name";
        this.age = 28;
    }

    public Student(String name, int age) //parameterise Constructo
    {
        this.name = name;
        this.age = age;
    }

     void display() 
    {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) 
    {
        //Student student1 = new Student();
        //student1.display();

        Student student2 = new Student("Krishna", 18);
        student2.display();
    }
}
