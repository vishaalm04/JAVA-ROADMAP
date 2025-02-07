package looping_stmts;

public class break_continue {

        public static void main(String[] args) {
            System.out.println("Even numbers between 1 and 10 (skip 6):");

            for (int i = 1; i <= 10; i++) {
                if (i == 6) {
                    continue;  // Skip when i equals 6
                }

                if (i % 2 == 0) {
                    System.out.println(i);
                }

                if (i == 8) {
                    System.out.println("Stopping the loop at 8.");
                    break;  // Stop loop when i equals 8
                }
            }

    }

}
