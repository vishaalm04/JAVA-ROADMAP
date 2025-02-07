// File: Parent.java
package modifiers;

public class parent {
    public int publicVar = 10;      // Accessible everywhere
    private int privateVar = 20;    // Accessible only inside this class
    protected int protectedVar = 30; // Accessible within the same package & subclass
    int defaultVar = 40;            // Accessible within the same package

    // Public method
    public void publicMethod() {
        System.out.println("Public Method: Accessible anywhere");
    }

    // Private method
    private void privateMethod() {
        System.out.println("Private Method: Accessible only in this class");
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("Protected Method: Accessible in subclass & same package");
    }

    // Default method
    void defaultMethod() {
        System.out.println("Default Method: Accessible within same package");
    }

    // Method to access private members
    public void showPrivate() {
        System.out.println("Private Var: " + privateVar);
        privateMethod();
    }
}
