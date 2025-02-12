package exp4;

class Employee {
    private static int totalEmployees = 0;
    private int employeeID;
    private String name;
    private String department;
    private double salary;

    // Default constructor
    public Employee() {
        this.employeeID = 0;
        this.name = "Default Name";
        this.department = "General";
        this.salary = 0.0;
        totalEmployees++;
    }

    // Parameterized constructor
    public Employee(int employeeID, String name, String department, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalEmployees++;
    }

    // Method to calculate salary
    public double calculateSalary() {
        return this.salary;
    }

    // Method to display employee details
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    // Static method to display total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void main(String[] args) {
        // Creating employees using default and parameterized constructors
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(101, "Krishna", "HR", 50000);
        Employee emp3 = new Employee(102, "Ishan", "IT", 70000);

        // Displaying employee details
        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();
        emp3.displayEmployeeInfo();

        // Displaying total employees
        Employee.displayTotalEmployees();
    }
}

