package string_tokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String data = "Java is fun";

        // Creating a StringTokenizer
        StringTokenizer tokenizer = new StringTokenizer(data);

        // Iterating through tokens
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
