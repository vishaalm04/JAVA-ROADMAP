package methods;

public class static_method {

    public static void greetStatic() {
        System.out.println("Hello from a static method!");
    }

    public static void main(String[] args) {
        static_method.greetStatic();  // Invoking directly using the class name

        static_method obj = new static_method();
        obj.greetStatic();  // This works but not the best practice
    }


}