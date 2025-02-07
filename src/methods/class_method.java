package methods;

public class class_method {

    // Static variable
    public static int sumResult = 0;

    public static void add(int a, int b) {

        sumResult = a + b;
    }


    public static int getResult()
    {
        return sumResult;
    }

    public static void main(String[] args) {

        class_method obj1 = new class_method();
        class_method obj2 = new class_method();


        obj1.add(5, 3);  // sumResult is now 8
        System.out.println("Sum after obj1 adds: " + obj1.getResult());  // Output: 8


        obj2.add(10, 4);  // sumResult is now 14
        System.out.println("Sum after obj2 adds: " + obj2.getResult());  // Output: 14


        obj1.add(20, 5);  // sumResult is now 25
        System.out.println("Sum after obj1 adds again: " + obj1.getResult());  // Output: 25

        // Accessing sumResult directly through the class name
        System.out.println("Sum accessed directly through class: " +  class_method.getResult());  // Output: 25
    }


}
