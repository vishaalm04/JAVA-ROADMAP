package constructor;


class Constructor {
    // Instance variables
    String brand;
    String model;
    int year;
    double price;

    // Constructor to initialize object
    public Constructor(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Method
    public void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Car Price: " + price);
    }

    // Method to update the price of the car
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }



    public static void main(String[] args) {

        Constructor car1 = new Constructor("Toyota", "Corolla", 2020, 20000.00);
        Constructor car2 = new Constructor("Honda", "Civic", 2021, 25000.00);


        System.out.println("Details of Car 1:");
        car1.displayDetails();  // Displaying details of car1
        System.out.println();

        System.out.println("Details of Car 2:");
        car2.displayDetails();  // Displaying details of car2
        System.out.println();

        // Updating the price of car1
        car1.updatePrice(18000.00);  // Updating price for car1

        System.out.println("Updated Details of Car 1:");
        car1.displayDetails();
    }
}
