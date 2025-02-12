package string_tokenizer;

import java.util.StringTokenizer;

public class MultiDelimiterExample {
    public static void main(String[] args) {
        String data = "Java|Python:C++-C#";

        // Using "|", ":", and "-" as delimiters
        StringTokenizer tokenizer = new StringTokenizer(data, "|:-");

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
