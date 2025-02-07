package constructor;

public class parameterized_constructor {

       // Instance variables
        String brand;
        String model;
        int year;

        // Parameterized constructor
        public parameterized_constructor(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }


        public void displayCarDetails() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
        }


        public static void main(String[] args) {

            parameterized_constructor car1 = new parameterized_constructor ("toyota", "Corolla", 2021);
            parameterized_constructor car2 = new parameterized_constructor("Honda", "Civic", 2022);


            System.out.println("Details of Car 1:");
            car1.displayCarDetails();

            System.out.println("\nDetails of Car 2:");
            car2.displayCarDetails();
        }


}
