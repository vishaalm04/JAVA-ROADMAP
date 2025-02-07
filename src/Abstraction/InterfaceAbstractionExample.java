package Abstraction;

// Interface
interface Vehicle {
    void start();  // Abstract method
    void stop();   // Abstract method
}

// Class implementing the interface
class Car implements Vehicle {
    public void start() {
        System.out.println("Car has started.");
    }

    public void stop() {
        System.out.println("Car has stopped.");
    }
}

public class InterfaceAbstractionExample {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
        myCar.stop();
    }
}
