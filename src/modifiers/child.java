
package modifiers;

public class child extends parent {
    public void showAccess() {
        System.out.println("Accessing from Child Class:");
        System.out.println("Public Var: " + publicVar);
        // System.out.println("Private Var: " + privateVar); //  Not Accessible
        System.out.println("Protected Var: " + protectedVar);
        System.out.println("Default Var: " + defaultVar);

        publicMethod();
        // privateMethod(); // Not Accessible
        protectedMethod();
        defaultMethod();
    }
}
