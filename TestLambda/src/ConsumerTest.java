import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {
        Consumer<Integer> Consumer1 = (x) -> {
            int num = x * 2;
            System.out.println(num);
        };
        Consumer<Integer> consumer2 = (x) -> {
            Integer num = x * 3;
            System.out.println(num);
        };
        Consumer1.andThen(consumer2).accept(4);

    }
}
