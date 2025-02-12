package exp4;

class University {
    // Static variable shared among all instances
    static String universityName = "UPES";
    
    // Non-static variable unique to each instance
    String studentName;
    
    // Constructor to initialize student name
    public University(String studentName) {
        this.studentName = studentName;
    }
    
    // Static method to display university name
    static void displayUniversityName() {
        System.out.println("University: " + universityName);
    }
    
    // Method to display student details
    void displayStudent() {
        System.out.println("Student: " + studentName + ", University: " + universityName);
    }
    
    public static void main(String[] args) {
        // Display university name using static method
        University.displayUniversityName();
        
        // Creating multiple student objects
        University student1 = new University("Krishna");
        University student2 = new University("Ishan");
        University student3 = new University("Rudresh");
        
        // Display student details
        student1.displayStudent();
        student2.displayStudent();
        student3.displayStudent();
    }
}

