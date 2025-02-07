package Polymorphism;

class Person {
    String name;
    int age;

    // Default constructor
    Person() {
        name = "Unknown";
        age = 0;
    }

    // Constructor with one parameter
    Person(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor with two parameters
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorOverloadingExample {
    public static void main(String[] args) {
        Person person1 = new Person();                      // Calls default constructor
        Person person2 = new Person("Alice");               // Calls constructor with one parameter
        Person person3 = new Person("Bob", 25);             // Calls constructor with two parameters

        person1.display();
        person2.display();
        person3.display();
    }
}
