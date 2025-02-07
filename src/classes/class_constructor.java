package classes;

public class class_constructor {

        public static void main(String[] args) {
            // Creating objects of the Car class using the constructor
            car car1 = new car("Toyota", "Corolla", 2020);
            car car2 = new car("Honda", "Civic", 2021);
            System.out.println("Car 1 Details:");
            car1.displayDetails();

            System.out.println("\nCar 2 Details:");
            car2.displayDetails();
        }


}
