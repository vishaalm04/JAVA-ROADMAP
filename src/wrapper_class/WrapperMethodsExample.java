package wrapper_class;

public class WrapperMethodsExample {
    public static void main(String[] args) {
        // Converting String to Integer
        int num = Integer.parseInt("100");
        System.out.println(num); // 100

        // Getting value from an Integer object
        Integer obj = Integer.valueOf(200);
        int value = obj.intValue(); // Unboxing
        System.out.println(value); // 200

        // Converting Integer to String
        String str = obj.toString();
        System.out.println(str); // "200"
    }
}

