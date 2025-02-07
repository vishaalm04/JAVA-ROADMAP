package methods;

public class types_of_methods {


    // 1. Method Without Parameters and Without Return Value
    public void displayMessage() {
        System.out.println("Welcome to Java Programming!");
    }

    // 2. Method Without Parameters but With Return Value
    public int getCurrentYear() {
        return java.time.Year.now().getValue();
    }

    // 3. Method With Parameters and Without Return Value
    public void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    // 4. Method With Parameters and With Return Value
    public int calculateArea(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        types_of_methods obj = new types_of_methods();

        // Calling Method 1
        obj.displayMessage();

        // Calling Method 2
        int year = obj.getCurrentYear();
        System.out.println("Current Year: " + year);

        // Calling Method 3
        obj.printSum(15, 25);

        // Calling Method 4
        int area = obj.calculateArea(5, 10);
        System.out.println("Area of Rectangle: " + area);
    }


}
