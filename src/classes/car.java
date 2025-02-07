package classes;

public class car {
    // Instance variables
    String brand;
    String model;
    int year;

    // Constructor to initialize the object
    public car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

