import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTester2 {
    public static void main(String args[]) {
        Predicate<String> predicate1 = n -> n.equals("a");
        System.out.println(predicate1.test("a"));
        System.out.println(predicate1.test("a"));
        System.out.println(predicate1.negate().test("a"));


        Predicate<String> predicate2 = n -> n.contains("a");
        Predicate<String> predicate3 = n -> n.contains("b");
        System.out.println("contains 'a and b'" +predicate2.and(predicate3).test("ab"));
        System.out.println("contains 'a and 1'" +predicate2.and(predicate3).test("a1"));
        System.out.println("contains 'a and 1'" +predicate2.or(predicate3).test("a1"));

    }
}
