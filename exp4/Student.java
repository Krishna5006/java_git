package exp4;

class Student {
    private String name;
    private int age;

    // Default constructor
    public Student() {
        this.name = "Default Name";
        this.age = 18;
    }

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating object using default constructor
        Student student1 = new Student();
        student1.display();

        // Creating object using parameterized constructor
        Student student2 = new Student("Krishna", 20);
        student2.display();
    }
}
