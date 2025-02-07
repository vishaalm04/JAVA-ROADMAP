package classes;


public class class_object {
    // Instance variables
    String brand;
    String model;
    int year;

    // Method to display car details
    void displayCarDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    // Main method
    public static void main(String[] args) {
        // Create an object
        class_object myCar = new class_object();

        // Assign values to the object's attributes
        myCar.brand = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2021;

        // Call the method to display car details
        myCar.displayCarDetails();
    }
}
