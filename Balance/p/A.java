package Balance.p;


public class A {
    public void publicMethod() {
        System.out.println("Public method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    void defaultMethod() {
        System.out.println("Default method");
    }

    private void privateMethod() {
        System.out.println("Private method");
    }

    // Method to demonstrate access to private method within the same class
    public void accessPrivateMethod() {
        privateMethod();
    }
}
