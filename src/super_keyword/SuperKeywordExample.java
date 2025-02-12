package super_keyword;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound();  // Calls Animal's sound method
        System.out.println("Dog barks");
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}

