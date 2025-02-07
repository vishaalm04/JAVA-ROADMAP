// Package declaration
package constructor;

// Class with a default constructor
public class defaultconstructor {

    // Instance variables (attributes)
    String brand;
    String model;
    int year;

    // Default constructor (no parameters)
    public defaultconstructor() {
        // Initializing with default values
        brand = "Unknown";
        model = "Unknown";
        year = 0;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating an object using the default constructor
        defaultconstructor car = new defaultconstructor();

        // Displaying default values
        System.out.println("Car Details (using Default Constructor):");
        car.displayDetails();
    }
}

