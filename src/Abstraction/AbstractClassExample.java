package Abstraction;

// Abstract class
abstract class Animal {
    abstract void makeSound();  // Abstract method

    void eat() {  // Concrete method
        System.out.println("This animal eats food.");
    }
}

// Subclass providing implementation for the abstract method
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();  // Calls the abstract method implementation
        myDog.eat();        // Calls the concrete method from the abstract class
    }
}
