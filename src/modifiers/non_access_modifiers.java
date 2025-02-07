package modifiers;
final class FinalClass {
    // Final variable (cannot be modified)
    final int finalValue = 100;

    // Static variable (shared)
    static int staticValue = 50;


    public void showValues() {
        System.out.println("Final Value: " + finalValue);
        System.out.println("Static Value: " + staticValue);
    }

    // Final method (cannot be overridden)
    public final void finalMethod() {
        System.out.println("This is a final method.");
    }
}


class NonAccessModifiersExample {
    public static void main(String[] args) {
        FinalClass obj1 = new FinalClass();
        obj1.showValues();

        // Modifying static variable
        FinalClass.staticValue = 75;


        FinalClass obj2 = new FinalClass();
        obj2.showValues();

        // obj1.finalValue = 200;  // Error: cannot assign a value to final variable
    }
}
