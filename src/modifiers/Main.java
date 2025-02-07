package modifiers;
public class Main {
    public static void main(String[] args) {
        parent parent = new parent();
        System.out.println("Accessing from Main Class (Same Package):");
        System.out.println("Public Var: " + parent.publicVar);
        // System.out.println("Private Var: " + parent.privateVar); //  Not Accessible
        System.out.println("Protected Var: " + parent.protectedVar);
        System.out.println("Default Var: " + parent.defaultVar);

        parent.publicMethod();
        // parent.privateMethod(); //Not Accessible
        parent.protectedMethod();
        parent.defaultMethod();

        parent.showPrivate(); //Accessing private members via a public method

        // Accessing from Subclass
        child child = new child();
        child.showAccess();
    }
}

