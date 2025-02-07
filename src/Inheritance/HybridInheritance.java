package Inheritance;

// Interface 1
interface ANIMAL {
    void eat();
}

// Interface 2
interface BIRD {
    void fly();
}

// Class 1
class DOG implements ANIMAL {
    public void eat() {
        System.out.println("Dog eats food.");
    }

    void bark() {
        System.out.println("Dog barks.");
    }
}

// Class 2
class Sparrow implements ANIMAL, BIRD {
    public void eat() {
        System.out.println("Sparrow eats grains.");
    }

    public void fly() {
        System.out.println("Sparrow can fly.");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        DOG dog = new DOG();
        dog.eat();
        dog.bark();

        Sparrow sparrow = new Sparrow();
        sparrow.eat();
        sparrow.fly();
    }
}
