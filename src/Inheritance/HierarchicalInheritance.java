package Inheritance;

// Superclass
class Animalss {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass 1
class Dogss extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Subclass 2
class Cat extends Animalss {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dogss dog = new Dogss();
        dog.eat();  // Inherited from Animal
        dog.bark(); // Method of Dog

        Cat cat = new Cat();
        cat.eat();  // Inherited from Animal
        cat.meow();// Method of Cat
       // cat.bark();error
    }
}

