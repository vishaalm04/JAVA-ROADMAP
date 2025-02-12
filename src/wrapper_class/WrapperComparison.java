package wrapper_class;
public class WrapperComparison {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;

        System.out.println(a.equals(b)); // true
        System.out.println(a == b);      // true (for small values due to caching)
        System.out.println(a == c);      // false (different objects)
    }
}
