package string_tokenizer;

import java.util.StringTokenizer;

public class DelimiterExample {
    public static void main(String[] args) {
        String data = "apple,banana,grape,orange";

        // Using ',' as the delimiter
        StringTokenizer tokenizer = new StringTokenizer(data, ",");

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}

