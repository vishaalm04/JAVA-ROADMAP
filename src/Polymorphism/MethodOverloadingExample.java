package Polymorphism;

class Calculator {


    int add(int a, int b) {
        return a + b;
    }


    int add(int a, int b, int c) {
        return a + b + c;
    }


    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 integers: " + calc.add(5, 10));           // Calls first method
        System.out.println("Sum of 3 integers: " + calc.add(5, 10, 15));       // Calls second method
        System.out.println("Sum of 2 doubles: " + calc.add(5.5, 10.5));        // Calls third method
    }
}

