package operators;

public class OperatorsDemo {
    public static void main(String[] args) {

        // 1. Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));

        // 2. Assignment Operators
        int c = a;
        System.out.println("\nAssignment Operators:");
        System.out.println("c = " + c);
        c += 5; // c = c + 5
        System.out.println("c += 5: " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2: " + c);

        // 3. Relational (Comparison) Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // 4. Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));  // AND
        System.out.println("x || y: " + (x || y));  // OR
        System.out.println("!x: " + (!x));          // NOT

        // 5. Unary Operators
        System.out.println("\nUnary Operators:");
        int d = 5;
        System.out.println("d = " + d);
        System.out.println("++d: " + (++d));  // Pre-increment
        System.out.println("d++: " + (d++));  // Post-increment
        System.out.println("--d: " + (--d));  // Pre-decrement
        System.out.println("d--: " + (d--));  // Post-decrement

        // 6. Bitwise Operators
        int e = 5, f = 3;
        System.out.println("\nBitwise Operators:");
        System.out.println("e & f: " + (e & f));  // AND
        System.out.println("e | f: " + (e | f));  // OR
        System.out.println("e ^ f: " + (e ^ f));  // XOR
        System.out.println("~e: " + (~e));        // NOT

        // 7. Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("\nTernary Operator:");
        System.out.println("Max of a and b: " + max);
    }
}

