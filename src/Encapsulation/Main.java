package Encapsulation;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("John Doe", 25, "123-45-6789");

        // Accessing data using getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modifying data using setters
        person.setName("Jane Doe");
        person.setAge(30);


        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());

        // Trying to set an invalid age
        person.setAge(-5);


        // System.out.println(person.str); //  Not Accessible: 'str' has no getter
        // person.str = "987-65-4321"; //  Not Accessible: 'str' is private
    }
}

