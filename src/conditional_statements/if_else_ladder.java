package conditional_statements;

public class if_else_ladder {
    public static void main(String[] args) {
        int number = 0;

        // if-else if-else ladder to check the sign of the number
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
