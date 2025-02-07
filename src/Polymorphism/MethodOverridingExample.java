package Polymorphism;

// Superclass
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass that overrides the sound() method
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// subclass that overrides the sound() method
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
         Dog myDog = new Dog();
        Animal myCat = new Cat();        // Reference of superclass, but object of subclass

        myAnimal.sound();  // Calls Animal's sound()
        myDog.sound();     // Calls Dog's overridden sound()
        myCat.sound();     // Calls Cat's overridden sound()
    }
}

