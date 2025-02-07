package Abstraction;

// Interface
interface Shape {
    // Abstract method
    void draw();

    // Default method
    default void display() {
        System.out.println("Displaying the shape.");
    }

    // Static method
    static void describe() {
        System.out.println("Shapes have dimensions and boundaries.");
    }
}

// Class
class InterfaceDemo implements Shape {
    // Implementing the abstract method
    public void draw() {
        System.out.println("Drawing a shape.");
    }

    public static void main(String[] args) {
        // 1. Class reference and class instantiation
        InterfaceDemo obj1 = new InterfaceDemo();
        obj1.draw();
        obj1.display();
        Shape.describe();

        System.out.println("\n---\n");

        // 2. Interface reference and class instantiation
        Shape obj2 = new InterfaceDemo();
        obj2.draw();
        obj2.display();
        Shape.describe();
    }
}

