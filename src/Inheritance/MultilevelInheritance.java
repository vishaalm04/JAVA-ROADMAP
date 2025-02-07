package Inheritance;

// Superclass
class Animals {
    void eats() {
        System.out.println("This animal eats food.");
    }
}

// Intermediate Subclass
class Mammal extends Animals {
    void walks() {
        System.out.println("Mammals walk on land.");
    }
}

// Subclass
class Dogs extends Mammal {
    void barks() {
        System.out.println("The dog barks.");
    }
    void eats() {
        System.out.println("These animals eats food.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Dogs dog = new Dogs();
        dog.eats();  // Inherited from Animal
        dog.walks(); // Inherited from Mammal
        dog.barks(); // Method of Dog
    }
}
