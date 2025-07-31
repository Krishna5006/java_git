public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Demonstrating the add method with different parameters
        System.out.println("Addition of two integers: " + calculator.add(5, 10));
        System.out.println("Addition of two doubles: " + calculator.add(5.5, 10.5));
        System.out.println("Addition of three integers: " + calculator.add(5, 10, 15));

        if (args.length != 3) 
        {
            System.out.println("Usage: java Calc <num1> <operator> <num2>");
            return;
        }
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[2]);
            String operator = args[1];
            switch (operator) 
            {
                case "+":
                    System.out.println("Sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("Difference of " + num1 + " and " + num2 + " is " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("Product of " + num1 + " and " + num2 + " is " + (num1 * num2));
                    break;
                default:
                    System.out.println("Invalid operator! Use +, -, or *");
            }
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Invalid number format! Please enter valid integers.");
        }
    }
}

