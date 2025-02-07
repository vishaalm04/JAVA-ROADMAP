package Inheritance;

// Interface 1
interface Flyable {
    void fly();
}

// Interface 2
interface Swimable {
    void swim();
}

// Class implementing both interfaces
class Bird implements Flyable, Swimable {
    public void fly() {
        System.out.println("The bird can fly.");
    }

    public void swim() {
        System.out.println("The bird can also swim.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.swim();
    }
}

